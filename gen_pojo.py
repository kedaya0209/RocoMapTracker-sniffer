#!/usr/bin/env python3
"""
gen_pojo.py - Generate Java record POJOs from .proto files.

Parses non-standard proto files (mixed proto2/proto3) using regex,
flattens nested messages with '_' separator, and generates one .java
record file per message under src/main/java/Next/pojo/.
"""

import os
import re
import sys
import zipfile
import glob
from pathlib import Path

# ── Configuration ──────────────────────────────────────────────────
SCRIPT_DIR = Path(__file__).resolve().parent
PROTO_DIR = SCRIPT_DIR / "src" / "main" / "proto"
OUTPUT_DIR = SCRIPT_DIR / "src" / "main" / "java" / "Next" / "pojo"

# Path to the roco-pcap-protos JAR (for checking which protobuf classes exist)
_M2_REPO = Path(os.path.expanduser("~/.m2/repository"))
_PROTO_JAR_GLOB = "com/luoke/roco-pcap-protos/*/roco-pcap-protos-*.jar"
# Whitelist file: if present, only generate from() for listed types
_WHITELIST_FILE = SCRIPT_DIR / "from_whitelist.txt"

# ── Proto scalar to Java type mapping ─────────────────────────────
SCALAR_TYPE_MAP = {
    "int32": "int", "sint32": "int", "uint32": "int",
    "fixed32": "int", "sfixed32": "int",
    "int64": "long", "sint64": "long", "uint64": "long",
    "fixed64": "long", "sfixed64": "long",
    "float": "float", "double": "double",
    "bool": "boolean",
    "string": "String",
    "bytes": "byte[]",
}

# Boxed versions for use inside generics (List<>, Map<>)
BOXED_TYPE_MAP = {
    "int": "Integer", "long": "Long", "float": "Float",
    "double": "Double", "boolean": "Boolean",
}


def boxed(java_type):
    """Return the boxed version of a Java type for use in generics."""
    return BOXED_TYPE_MAP.get(java_type, java_type)


def load_whitelist():
    """Load the from() whitelist file. Returns a set of fully qualified type names."""
    if not _WHITELIST_FILE.exists():
        return None  # No whitelist = generate from() for all types (if JAR check passes)
    names = set()
    for line in _WHITELIST_FILE.read_text(encoding="utf-8").splitlines():
        line = line.strip()
        if line and not line.startswith("#"):
            names.add(line)
    return names


def load_proto_classes_from_jar():
    """
    Scan the roco-pcap-protos JAR for all protobuf message classes.
    Returns a set of fully qualified class names (e.g. "Next.BattleData.BattleDamageInfo").
    """
    jar_dir = _M2_REPO / "com" / "luoke" / "roco-pcap-protos"
    jars = sorted(jar_dir.glob("*/*.jar"), reverse=True)
    # Pick the compiled JAR (not sources)
    jar = None
    for j in jars:
        if "-sources" not in j.name:
            jar = j
            break
    if jar is None:
        print("WARNING: No roco-pcap-protos JAR found, from() will not be generated",
              file=sys.stderr)
        return set()

    classes = set()
    with zipfile.ZipFile(jar) as z:
        for name in z.namelist():
            if not name.endswith(".class"):
                continue
            cls = name.replace("/", ".").replace(".class", "")
            # Skip Builder, OrBuilder, anonymous inner classes
            parts = cls.split(".")
            if any(p.startswith("Builder") or p == "OrBuilder" or p.isdigit()
                   for p in parts):
                continue
            # Convert Outer$Inner to Outer.Inner
            cls = cls.replace("$", ".")
            classes.add(cls)
    return classes


def box_map_type(map_type_str):
    """
    Box primitive types inside a Map<K,V> type string.
    e.g. 'java.util.Map<int, String>' -> 'java.util.Map<Integer, String>'
    """
    # Extract inner types from Map<K, V>
    m = re.match(r"java\.util\.Map<(.+),\s*(.+)>", map_type_str)
    if m:
        k = boxed(m.group(1).strip())
        v = boxed(m.group(2).strip())
        return "java.util.Map<" + k + ", " + v + ">"
    return map_type_str

# Global registries (populated after parsing all files)
_all_message_names = set()
_all_enum_names = set()
_proto_classes = set()  # Available protobuf classes from JAR
_from_whitelist = None  # from() whitelist (None = no whitelist)
# Per-file registries: {source_file: set of simple names}
_messages_by_file = {}   # source_file -> set of message java_names
_enums_by_file = {}      # source_file -> set of enum simple names
# Message metadata: {java_name -> ProtoMessage}
_message_registry = {}


JAVA_RESERVED = frozenset({
    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
    "class", "const", "continue", "default", "do", "double", "else", "enum",
    "extends", "final", "finally", "float", "for", "goto", "if", "implements",
    "import", "instanceof", "int", "interface", "long", "native", "new",
    "package", "private", "protected", "public", "return", "short", "static",
    "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
    "transient", "try", "void", "volatile", "while",
    "true", "false", "null",
})


def snake_to_camel(name):
    """Convert snake_case to camelCase, appending _ if the result is a Java keyword."""
    parts = name.split("_")
    result = parts[0] + "".join(p.capitalize() for p in parts[1:])
    if result in JAVA_RESERVED:
        result += "_"
    return result


def strip_line_comment(line):
    """Remove // comments from a line."""
    idx = line.find("//")
    if idx >= 0:
        return line[:idx]
    return line


def proto_file_to_outer_class(source_file):
    """
    Map a proto filename to its Java outer class name.
    e.g. 'battle_data.proto' -> 'BattleData'
    """
    base = source_file.rsplit(".", 1)[0]  # strip .proto
    return "".join(part.capitalize() for part in base.split("_"))


def is_enum_type(proto_type):
    """Check if a proto type reference is an enum."""
    if proto_type in SCALAR_TYPE_MAP:
        return False
    if proto_type in _all_enum_names:
        return True
    stripped = proto_type
    if stripped.startswith("Next."):
        stripped = stripped[len("Next."):]
    flat = stripped.replace(".", "_")
    simple = stripped.split(".")[-1]
    return flat in _all_enum_names or simple in _all_enum_names


# ── Data structures ───────────────────────────────────────────────

class ProtoField:
    """Represents a single field inside a message."""
    __slots__ = ("repeated", "proto_type", "name", "field_number")

    def __init__(self, repeated, proto_type, name, field_number):
        self.repeated = repeated
        self.proto_type = proto_type
        self.name = name
        self.field_number = field_number


class ProtoMessage:
    """Represents a parsed message definition."""
    def __init__(self, java_name, fields, source_file, nested=False):
        self.java_name = java_name
        self.fields = fields
        self.source_file = source_file
        self.nested = nested  # True if defined inside another message


# ── Regex patterns ────────────────────────────────────────────────

RE_MESSAGE_START = re.compile(r"^\s*message\s+(\w+)\s*\{")
RE_ENUM_START = re.compile(r"^\s*enum\s+(\w+)\s*\{")
RE_ONEOF_START = re.compile(r"^\s*oneof\s+(\w+)\s*\{")
RE_MAP_FIELD = re.compile(
    r"^\s*map\s*<\s*(\w+(?:\.\w+)*)\s*,\s*(\w+(?:\.\w+)*)\s*>\s+(\w+)\s*=\s*(\d+)"
)
RE_FIELD = re.compile(
    r"^\s*(repeated\s+)?(\w+(?:\.\w+)*)\s+(\w+)\s*=\s*(\d+)"
)


def parse_proto_file(filepath):
    """
    Parse a single .proto file and return (messages, enum_names).

    Uses a brace-depth state machine to handle nested messages and enums.
    """
    text = filepath.read_text(encoding="utf-8")
    lines = text.splitlines()
    source_file = filepath.name

    messages = []
    enum_names = set()

    # message_stack: list of (java_name, depth_when_opened, fields_list, nested)
    message_stack = []
    in_enum = False
    enum_open_depth = 0

    brace_depth = 0

    for raw_line in lines:
        line = strip_line_comment(raw_line).strip()
        if not line:
            continue

        # Skip non-field/non-message lines
        if line.startswith(("package ", "import ", "option ", "syntax ",
                            "reserved ", "extensions ", "service ", "rpc ")):
            continue

        # ── Enum start ──
        m = RE_ENUM_START.match(line)
        if m and not in_enum:
            enum_name = m.group(1)
            enum_names.add(enum_name)
            # Build fully-qualified name for nested enums
            if message_stack:
                parent_flat = message_stack[-1][0]
                parent_proto = parent_flat.replace("_", ".")
                fq = "Next." + parent_proto + "." + enum_name
            else:
                fq = "Next." + enum_name
            enum_names.add(fq)
            in_enum = True
            # enum_open_depth = depth after the opening brace on this line
            enum_open_depth = brace_depth + line.count("{")

        # ── Message start ──
        m = RE_MESSAGE_START.match(line)
        if m and not in_enum:
            msg_name = m.group(1)
            nested = len(message_stack) > 0
            if message_stack:
                java_name = message_stack[-1][0] + "_" + msg_name
            else:
                java_name = msg_name
            open_depth = brace_depth + line.count("{")
            message_stack.append((java_name, open_depth, [], nested))

        # ── Oneof start (just track depth, fields are parsed normally) ──
        # We don't need special handling since oneof fields look like regular fields.

        # ── Map field ──
        m = RE_MAP_FIELD.match(line)
        if m and not in_enum and message_stack:
            k_type = m.group(1)
            v_type = m.group(2)
            fname = m.group(3)
            fnum = int(m.group(4))
            jk = resolve_type_name(k_type)
            jv = resolve_type_name(v_type)
            java_type = "java.util.Map<" + jk + ", " + jv + ">"
            field = ProtoField(
                repeated=False, proto_type=java_type,
                name=fname, field_number=fnum
            )
            message_stack[-1][2].append(field)

        # ── Regular field ──
        elif not in_enum and message_stack:
            m = RE_FIELD.match(line)
            if m:
                repeated = bool(m.group(1))
                proto_type = m.group(2)
                fname = m.group(3)
                fnum = int(m.group(4))
                field = ProtoField(
                    repeated=repeated, proto_type=proto_type,
                    name=fname, field_number=fnum
                )
                message_stack[-1][2].append(field)

        # ── Track brace depth ──
        brace_depth += line.count("{") - line.count("}")

        # ── Check if we exited an enum ──
        if in_enum and brace_depth < enum_open_depth:
            in_enum = False

        # ── Check if any messages closed ──
        while message_stack and brace_depth < message_stack[-1][1]:
            java_name, _, fields, nested = message_stack.pop()
            messages.append(ProtoMessage(java_name, list(fields), source_file, nested))

    # Close any remaining open messages (malformed proto)
    while message_stack:
        java_name, _, fields, nested = message_stack.pop()
        messages.append(ProtoMessage(java_name, list(fields), source_file, nested))

    return messages, enum_names


def resolve_type_name(proto_type):
    """
    Best-effort resolution of a proto type to a Java type name.
    Used during parsing for map key/value types where full registry
    is not yet available. Does simple scalar mapping and Next. stripping.
    """
    if proto_type in SCALAR_TYPE_MAP:
        return SCALAR_TYPE_MAP[proto_type]
    if proto_type.startswith("dataconfig."):
        return "int"
    if proto_type.startswith("Next."):
        return proto_type[len("Next."):].replace(".", "_")
    return proto_type


def map_proto_type(proto_type):
    """
    Map a proto field type to a Java type string using the global registries.
    Called during code generation when all types are known.
    """
    if proto_type in SCALAR_TYPE_MAP:
        return SCALAR_TYPE_MAP[proto_type]

    # Already a resolved Java type (e.g. java.util.Map<...>)
    if proto_type.startswith("java.util."):
        return proto_type

    # dataconfig.* -> external enum, map to int
    if proto_type.startswith("dataconfig."):
        return "int"

    # Strip Next. prefix
    stripped = proto_type
    has_next_prefix = stripped.startswith("Next.")
    if has_next_prefix:
        stripped = stripped[len("Next."):]

    flat = stripped.replace(".", "_")
    simple = stripped.split(".")[-1]

    # Check if it's a known enum
    if (proto_type in _all_enum_names
            or flat in _all_enum_names
            or simple in _all_enum_names):
        return "int"

    # Check if it's a known message
    if flat in _all_message_names:
        return flat

    # If it had Next. prefix, assume it's a message
    if has_next_prefix:
        return flat

    # Try simple name as message
    if simple in _all_message_names:
        return simple

    # Fallback: assume int (likely an unseen enum)
    return "int"


# ── Code generation ───────────────────────────────────────────────

def proto_class_name(msg):
    """
    Get the protobuf Java class name for a message.
    For nested messages, converts '_' flattening back to '.' nesting.
    For top-level messages, returns the java_name as-is.
    """
    if msg.nested:
        return msg.java_name.replace("_", ".")
    return msg.java_name


def resolve_from_type(proto_type, source_file):
    """
    Resolve a proto type reference to a fully qualified Java type for from() method.
    Returns (java_type, needs_import, import_class) where:
      - java_type: the type to use in from() body (e.g. "BattleInitInfo", "PetInfo")
      - needs_import: True if an import is needed
      - import_class: the import string (e.g. "Next.BattleData") or None
    """
    if proto_type in SCALAR_TYPE_MAP:
        return (SCALAR_TYPE_MAP[proto_type], False, None)

    if proto_type.startswith("java.util."):
        return (proto_type, False, None)

    if proto_type.startswith("dataconfig."):
        return ("int", False, None)

    stripped = proto_type
    if stripped.startswith("Next."):
        stripped = stripped[len("Next."):]
    flat = stripped.replace(".", "_")
    simple = stripped.split(".")[-1]

    # Enum → int
    if is_enum_type(proto_type):
        return ("int", False, None)

    # Message → resolve outer class
    # Try flat name first, then simple name
    msg = _message_registry.get(flat) or _message_registry.get(simple)
    if msg is None:
        # Fallback
        return (flat, False, None)

    src = msg.source_file
    outer = proto_file_to_outer_class(src)
    class_name = proto_class_name(msg)

    if src == source_file:
        # Same file: no import needed, use OuterClass.Type directly
        return (outer + "." + class_name, False, None)
    else:
        # Different file: need import
        return (outer + "." + class_name, True, "Next." + outer)


def proto_getter_name(field_name):
    """
    Convert a proto field name to the protobuf Java getter name.
    Protobuf generates camelCase getters: caster_id -> getCasterId
    """
    # Split on underscore and capitalize each part after the first
    parts = field_name.split("_")
    camel = parts[0] + "".join(p.capitalize() for p in parts[1:])
    return camel[0].upper() + camel[1:]


# ── parseFrom() generation helpers ──

# Map proto scalar types to Pojos.readXxx method names
_SCALAR_READER = {
    "int32": "Int", "sint32": "Int", "uint32": "Int",
    "fixed32": "Int", "sfixed32": "Int",
    "int64": "Long", "sint64": "Long", "uint64": "Long",
    "fixed64": "Long", "sfixed64": "Long",
    "float": "Float", "double": "Double",
    "bool": "Bool",
    "string": "String", "bytes": "Bytes",
}

_SCALAR_DEFAULT = {
    "int32": "0", "sint32": "0", "uint32": "0",
    "fixed32": "0", "sfixed32": "0",
    "int64": "0L", "sint64": "0L", "uint64": "0L",
    "fixed64": "0L", "sfixed64": "0L",
    "float": "0f", "double": "0.0",
    "bool": "false",
    "string": '""', "bytes": "new byte[0]",
}

_SCALAR_LIST_READER = {
    "int32": "IntList", "sint32": "IntList", "uint32": "IntList",
    "fixed32": "IntList", "sfixed32": "IntList",
    "int64": "LongList", "sint64": "LongList", "uint64": "LongList",
    "fixed64": "LongList", "sfixed64": "LongList",
    "float": "FloatList", "double": "DoubleList",
    "bool": "BoolList",
    "string": "StringList", "bytes": "BytesList",
}


def parse_field_expr(proto_type, field_number, repeated):
    """
    Generate the Pojos.readXxx() expression for a field in parseFrom().
    Returns a Java expression string.
    """
    fno = str(field_number)

    # Map types
    if proto_type.startswith("java.util.Map"):
        return "java.util.Map.of()"  # Maps not supported in parseFrom

    # dataconfig enums -> int
    if proto_type.startswith("dataconfig."):
        if repeated:
            return "Pojos.readIntList(fields, " + fno + ")"
        return "Pojos.readInt(fields, " + fno + ", 0)"

    # Check if enum
    if is_enum_type(proto_type):
        if repeated:
            return "Pojos.readIntList(fields, " + fno + ")"
        return "Pojos.readInt(fields, " + fno + ", 0)"

    # Scalar types - all Pojos.readXxx() have no-default overloads
    if proto_type in SCALAR_TYPE_MAP:
        if repeated:
            reader = _SCALAR_LIST_READER.get(proto_type, "IntList")
            return "Pojos.read" + reader + "(fields, " + fno + ")"
        reader = _SCALAR_READER.get(proto_type, "Int")
        return "Pojos.read" + reader + "(fields, " + fno + ")"

    # Message type - use Next.pojo.Xxx to avoid collision with proto class
    # Need the flattened POJO name (with _ for nested messages)
    stripped = proto_type
    if stripped.startswith("Next."):
        stripped = stripped[len("Next."):]
    flat = stripped.replace(".", "_")
    simple = stripped.split(".")[-1]
    # Look up in message registry to get the actual POJO java_name
    msg = _message_registry.get(flat) or _message_registry.get(simple)
    if msg:
        pojo_name = msg.java_name
    else:
        pojo_name = flat
    pojo_ref = "Next.pojo." + pojo_name
    if repeated:
        return ("Pojos.readMessageList(fields, " + fno + ").stream()"
                ".map(" + pojo_ref + "::parseFrom).toList()")

    return "Pojos.readMessage(fields, " + fno + ") != null ? " + pojo_ref + ".parseFrom(Pojos.readMessage(fields, " + fno + ")) : null"


def from_field_expr(proto_type, field_name, repeated, source_file):
    """
    Generate the from() expression for a single field.
    Returns a Java expression string.
    """
    getter_name = proto_getter_name(field_name)

    if proto_type in SCALAR_TYPE_MAP:
        return "proto.get" + getter_name + "()"

    if proto_type.startswith("java.util."):
        return "proto.get" + getter_name + "()"

    if proto_type.startswith("dataconfig."):
        getter = "proto.get" + getter_name + "Value()"
        if repeated:
            return getter
        return getter

    if is_enum_type(proto_type):
        getter = "proto.get" + getter_name + "Value()"
        if repeated:
            return getter
        return getter

    # Message type
    jtype, _, _ = resolve_from_type(proto_type, source_file)
    has_method = "proto.has" + getter_name + "()"
    get_method = "proto.get" + getter_name + "()"

    if repeated:
        list_getter = "proto.get" + getter_name + "List()"
        return list_getter + ".stream().map(" + jtype + "::from).toList()"

    return has_method + " ? " + jtype + ".from(" + get_method + ") : null"


def generate_record(msg):
    """Generate Java record source code for a ProtoMessage."""
    out = []
    out.append("// Generated from " + msg.source_file)
    out.append("package Next.pojo;")
    out.append("")

    needs_list = any(f.repeated for f in msg.fields)
    needs_map = any(f.proto_type.startswith("java.util.Map") for f in msg.fields)

    imports = ["import com.roco.sniffer.codec.Pojos;",
               "import com.roco.sniffer.codec.ProtoParser;",
               "import com.roco.sniffer.codec.ProtoParser.ProtoField;"]
    if needs_list:
        imports.append("import java.util.List;")
    if needs_map:
        imports.append("import java.util.Map;")

    for imp in sorted(set(imports)):
        out.append(imp)
    out.append("")

    out.append('@SuppressWarnings("unused")')

    if not msg.fields:
        out.append("public record " + msg.java_name + "() {")
        out.append("    public static " + msg.java_name + " parseFrom(byte[] data) {")
        out.append("        return new " + msg.java_name + "();")
        out.append("    }")
        out.append("    public static " + msg.java_name + " parseFrom(java.util.List<ProtoField> fields) {")
        out.append("        return new " + msg.java_name + "();")
        out.append("    }")
    else:
        out.append("public record " + msg.java_name + "(")
        for i, field in enumerate(msg.fields):
            java_type = map_proto_type(field.proto_type)
            if field.repeated:
                java_type = "List<" + boxed(java_type) + ">"
            elif java_type.startswith("java.util.Map"):
                java_type = box_map_type(java_type)
            comma = "," if i < len(msg.fields) - 1 else ""
            camel = snake_to_camel(field.name)
            out.append("    " + java_type + " " + camel + comma)
        out.append(") {")

        # parseFrom(byte[]) method
        out.append("    public static " + msg.java_name + " parseFrom(byte[] data) {")
        out.append("        java.util.List<ProtoField> fields = ProtoParser.parse(data);")
        out.append("        return new " + msg.java_name + "(")
        for i, field in enumerate(msg.fields):
            expr = parse_field_expr(field.proto_type, field.field_number, field.repeated)
            comma = "," if i < len(msg.fields) - 1 else ""
            out.append("            " + expr + comma)
        out.append("        );")
        out.append("    }")

        # parseFrom(List<ProtoField>) for nested messages
        out.append("    public static " + msg.java_name + " parseFrom(java.util.List<ProtoField> fields) {")
        out.append("        return new " + msg.java_name + "(")
        for i, field in enumerate(msg.fields):
            expr = parse_field_expr(field.proto_type, field.field_number, field.repeated)
            comma = "," if i < len(msg.fields) - 1 else ""
            out.append("            " + expr + comma)
        out.append("        );")
        out.append("    }")

    out.append("}")
    out.append("")
    return "\n".join(out)


def generate_index(all_messages):
    """Generate the index file listing all generated message classes."""
    out = []
    out.append("// Auto-generated index of all proto message POJOs")
    out.append("package Next.pojo;")
    out.append("")
    out.append("/**")
    out.append(" * Quick reference of all generated proto message records.")
    out.append(" * Total: " + str(len(all_messages)) + " messages")
    out.append(" */")
    out.append("public final class ProtoMessages {")
    out.append("    private ProtoMessages() {}")
    out.append("")

    # Group by source file
    by_file = {}
    for msg in sorted(all_messages, key=lambda m: (m.source_file, m.java_name)):
        by_file.setdefault(msg.source_file, []).append(msg.java_name)

    for src_file in sorted(by_file):
        names = by_file[src_file]
        out.append("    // " + src_file + " (" + str(len(names)) + " messages)")
        for name in names:
            out.append("    //   - " + name)
        out.append("")

    out.append("}")
    out.append("")
    return "\n".join(out)


# ── Main ──────────────────────────────────────────────────────────

def main():
    global _all_message_names, _all_enum_names
    global _messages_by_file, _enums_by_file, _message_registry
    global _proto_classes, _from_whitelist

    if not PROTO_DIR.exists():
        print("ERROR: Proto directory not found: " + str(PROTO_DIR), file=sys.stderr)
        sys.exit(1)

    proto_files = sorted(PROTO_DIR.glob("*.proto"))
    if not proto_files:
        print("ERROR: No .proto files found in " + str(PROTO_DIR), file=sys.stderr)
        sys.exit(1)

    print("Found " + str(len(proto_files)) + " .proto files in " + str(PROTO_DIR))

    # ── Pass 1: Parse all proto files ──
    all_messages = []
    all_enum_names_global = set()

    for pf in proto_files:
        msgs, enums = parse_proto_file(pf)
        all_messages.extend(msgs)
        all_enum_names_global.update(enums)

    # Build global registries
    _all_message_names = {m.java_name for m in all_messages}
    _all_enum_names = all_enum_names_global

    # Build per-file registries
    for m in all_messages:
        _messages_by_file.setdefault(m.source_file, set()).add(m.java_name)
    # Enums by file: we need to track which file each enum comes from
    # Re-parse to get per-file enum info
    for pf in proto_files:
        source = pf.name
        text = pf.read_text(encoding="utf-8")
        for line in text.splitlines():
            line = strip_line_comment(line).strip()
            m = RE_ENUM_START.match(line)
            if m:
                _enums_by_file.setdefault(source, set()).add(m.group(1))

    # Build message registry
    _message_registry = {m.java_name: m for m in all_messages}

    # Load available protobuf classes from JAR
    _proto_classes = load_proto_classes_from_jar()
    if _proto_classes:
        print("Loaded " + str(len(_proto_classes)) + " protobuf classes from JAR")

    # Load from() whitelist
    _from_whitelist = load_whitelist()
    if _from_whitelist:
        print("Loaded from() whitelist: " + str(len(_from_whitelist)) + " types")

    print("Parsed " + str(len(all_messages)) + " messages, "
          + str(len(all_enum_names_global)) + " enum types")

    # ── Pass 2: Generate Java files ──
    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

    # Detect case collisions (Windows has case-insensitive filesystem)
    seen_lower = {}
    case_collisions = set()
    for msg in all_messages:
        lower = msg.java_name.lower()
        if lower in seen_lower:
            # Keep the one that appears first, mark the other as collision
            case_collisions.add(msg.java_name)
        else:
            seen_lower[lower] = msg.java_name

    if case_collisions:
        print("Removing " + str(len(case_collisions)) + " case-collision POJOs: "
              + ", ".join(sorted(case_collisions)))

    generated = 0
    errors = 0

    for msg in all_messages:
        if msg.java_name in case_collisions:
            continue
        try:
            content = generate_record(msg)
            out_path = OUTPUT_DIR / (msg.java_name + ".java")
            out_path.write_text(content, encoding="utf-8")
            generated += 1
        except Exception as e:
            print("ERROR generating " + msg.java_name + ": " + str(e),
                  file=sys.stderr)
            errors += 1

    # ── Generate index file ──
    try:
        index_content = generate_index(all_messages)
        index_path = OUTPUT_DIR / "ProtoMessages.java"
        index_path.write_text(index_content, encoding="utf-8")
        generated += 1
        print("Generated index: " + str(index_path))
    except Exception as e:
        print("ERROR generating index: " + str(e), file=sys.stderr)
        errors += 1

    print("")
    print("Done: " + str(generated) + " files generated, " + str(errors) + " errors")
    print("Output: " + str(OUTPUT_DIR))

    return 0


def strip_from_methods(bad_names):
    """
    Re-generate POJO files for bad_names without from() methods.
    Called by --strip-from <error_file> mode.
    """
    global _all_message_names, _all_enum_names
    global _messages_by_file, _enums_by_file, _message_registry

    if not PROTO_DIR.exists():
        print("ERROR: Proto directory not found: " + str(PROTO_DIR), file=sys.stderr)
        return 1

    proto_files = sorted(PROTO_DIR.glob("*.proto"))
    all_messages = []
    all_enum_names_global = set()
    for pf in proto_files:
        msgs, enums = parse_proto_file(pf)
        all_messages.extend(msgs)
        all_enum_names_global.update(enums)
    _all_message_names = {m.java_name for m in all_messages}
    _all_enum_names = all_enum_names_global
    for m in all_messages:
        _messages_by_file.setdefault(m.source_file, set()).add(m.java_name)
    for pf in proto_files:
        text = pf.read_text(encoding="utf-8")
        for line in text.splitlines():
            line = strip_line_comment(line).strip()
            m = RE_ENUM_START.match(line)
            if m:
                _enums_by_file.setdefault(pf.name, set()).add(m.group(1))
    _message_registry = {m.java_name: m for m in all_messages}

    stripped = 0
    for msg in all_messages:
        if msg.java_name in bad_names:
            content = generate_record_no_from(msg)
            out_path = OUTPUT_DIR / (msg.java_name + ".java")
            out_path.write_text(content, encoding="utf-8")
            stripped += 1

    print("Stripped from() from " + str(stripped) + " files")
    return 0


def generate_record_no_from(msg):
    """Generate Java record without from() method."""
    out = []
    out.append("// Generated from " + msg.source_file)
    out.append("package Next.pojo;")
    out.append("")

    needs_list = any(f.repeated for f in msg.fields)
    needs_map = any(f.proto_type.startswith("java.util.Map") for f in msg.fields)
    imports = []
    if needs_list:
        imports.append("import java.util.List;")
    if needs_map:
        imports.append("import java.util.Map;")
    if imports:
        for imp in imports:
            out.append(imp)
        out.append("")

    out.append('@SuppressWarnings("unused")')
    if not msg.fields:
        out.append("public record " + msg.java_name + "() {}")
    else:
        out.append("public record " + msg.java_name + "(")
        for i, field in enumerate(msg.fields):
            java_type = map_proto_type(field.proto_type)
            if field.repeated:
                java_type = "List<" + boxed(java_type) + ">"
            elif java_type.startswith("java.util.Map"):
                java_type = box_map_type(java_type)
            comma = "," if i < len(msg.fields) - 1 else ""
            camel = snake_to_camel(field.name)
            out.append("    " + java_type + " " + camel + comma)
        out.append(") {}")
    out.append("")
    return "\n".join(out)


if __name__ == "__main__":
    sys.exit(main())
