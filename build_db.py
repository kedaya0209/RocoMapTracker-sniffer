"""从 data/ 的 JSON 文件生成 rmt.db SQLite 数据库。

用法：python build_db.py
输出：rmt.db
"""
import json
import re
import sqlite3
from pathlib import Path

DATA_DIR = Path(__file__).parent / "data"
DB_PATH = Path(__file__).parent / "rmt.db"

# 图标资源目录（按表名分子目录，文件名为 ID.png）
# 例如: ICON_DIR/skill/200074.png、ICON_DIR/bag_item/100101.png
ICON_DIR = Path(__file__).parent / "data" / "icons"

# 表定义：(表名, JSON文件名, [(列名, JSON字段名, 类型), ...])
TABLES = [
    ("scene_conf", "SCENE_CONF.json", [
        ("id", "id", "INTEGER"),
        ("scene_res_id", "scene_res_id", "INTEGER"),
        ("scene_name", "scene_name", "TEXT"),
    ]),
    ("world_map_block", "WORLD_MAP_BLOCK_CONF.json", [
        ("id", "id", "INTEGER"),
        ("scene_res_id", "scene_res_id", "INTEGER"),
        ("map_center_position_xyz", "map_center_position_xyz", "TEXT"),
        ("side_length", "side_length", "REAL"),
    ]),
    ("bag_item", "BAG_ITEM_CONF.json", [
        ("id", "id", "INTEGER"),
        ("name", "name", "TEXT"),
        ("icon", "icon", "BLOB"),
    ]),
    ("area_func", "AREA_FUNC_CONF.json", [
        ("id", "id", "INTEGER"),
        ("editor_name", "editor_name", "TEXT"),
    ]),
    ("skill", "SKILL_CONF.json", [
        ("id", "id", "INTEGER"),
        ("name", "name", "TEXT"),
        ("icon", "icon", "BLOB"),
    ]),
    ("buff", "BUFF_CONF.json", [
        ("id", "id", "INTEGER"),
        ("name", ("name", "editor_name"), "TEXT"),  # 优先 name，fallback editor_name
        ("icon", "icon", "BLOB"),
    ]),
    ("effect", "EFFECT_CONF.json", [
        ("id", "id", "INTEGER"),
        ("editor_name", "editor_name", "TEXT"),
    ]),
    ("pet", "PET_CONF.json", [
        ("id", "id", "INTEGER"),
        ("name", "name", "TEXT"),
        ("icon", "base_id", "BLOB"),
    ]),
    ("nature", "NATURE_CONF.json", [
        ("id", "id", "INTEGER"),
        ("name", "name", "TEXT"),
    ]),
    ("attribute", "ATTRIBUTE_CONF.json", [
        ("id", "attribute", "INTEGER"),
        ("name", "attribute_name", "TEXT"),
    ]),
]


def load_json(path: Path) -> dict:
    with path.open("r", encoding="utf-8-sig") as f:
        return json.load(f)


def build():
    if DB_PATH.exists():
        DB_PATH.unlink()

    conn = sqlite3.connect(str(DB_PATH))
    conn.execute("PRAGMA journal_mode=WAL")
    cur = conn.cursor()

    for table_name, json_file, columns in TABLES:
        json_path = DATA_DIR / json_file
        if not json_path.exists():
            print(f"[SKIP] {json_file} 不存在")
            continue

        data = load_json(json_path)
        rows_data = data.get("RocoDataRows", {})

        # 建表
        col_defs = ", ".join(f"{col} {typ}" for col, _, typ in columns)
        cur.execute(f"CREATE TABLE {table_name} ({col_defs})")

        # 插入
        col_names = [col for col, _, _ in columns]
        placeholders = ", ".join("?" for _ in columns)
        insert_sql = f"INSERT INTO {table_name} ({', '.join(col_names)}) VALUES ({placeholders})"

        # 预加载图标文件（icon_dir/table_name/{id_or_name}.png）
        icon_dir = ICON_DIR / table_name
        icon_cache: dict[str, bytes] = {}  # key: 文件名stem
        if icon_dir.is_dir():
            for p in icon_dir.iterdir():
                if p.suffix.lower() in (".png", ".jpg", ".jpeg", ".webp"):
                    icon_cache[p.stem] = p.read_bytes()
            if icon_cache:
                print(f"  图标: {len(icon_cache)} 个 (from {icon_dir})")

        count = 0
        for _key, row in rows_data.items():
            values = []
            for col_name, json_field, typ in columns:
                if typ == "BLOB":
                    # 优先按 row ID 查找（bag_item/skill 按 ID 保存）
                    row_id = row.get("id")
                    blob = icon_cache.get(str(row_id)) if row_id is not None else None
                    if blob is None:
                        # fallback: 从 JSON 字段值查找
                        field_val = row.get(json_field)
                        if field_val is not None:
                            val_str = str(field_val)
                            # 路径类型: Texture2D'.../100101.100101' → "100101"
                            m = re.search(r"/([^/]+)\.(\1[^']*)", val_str)
                            if m:
                                icon_key = m.group(1)
                                if icon_key.endswith("_png"):
                                    icon_key = icon_key[:-4]
                            else:
                                # 纯数值类型（如 pet base_id=3011）
                                icon_key = val_str
                            blob = icon_cache.get(icon_key)
                    values.append(blob)
                    continue
                if isinstance(json_field, tuple):
                    val = None
                    for f in json_field:
                        val = row.get(f)
                        if val is not None:
                            break
                else:
                    val = row.get(json_field)
                if typ == "INTEGER":
                    values.append(int(val) if val is not None else None)
                elif typ == "REAL":
                    values.append(float(val) if val is not None else None)
                else:
                    values.append(str(val) if val is not None else None)
            cur.execute(insert_sql, values)
            count += 1

        print(f"[OK] {table_name}: {count} 行 (from {json_file})")

    # 索引
    cur.execute("CREATE INDEX idx_scene_res_id ON scene_conf(scene_res_id)")
    cur.execute("CREATE INDEX idx_world_res_id ON world_map_block(scene_res_id)")

    conn.commit()
    conn.close()
    print(f"\n生成完成: {DB_PATH}")
    print(f"文件大小: {DB_PATH.stat().st_size / 1024:.1f} KB")


if __name__ == "__main__":
    build()
