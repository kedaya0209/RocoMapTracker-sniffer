// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WorldCombatDotsSkillRcdEndInfo(
    int skillId,
    String GUID
) {
    public static WorldCombatDotsSkillRcdEndInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WorldCombatDotsSkillRcdEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static WorldCombatDotsSkillRcdEndInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WorldCombatDotsSkillRcdEndInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
