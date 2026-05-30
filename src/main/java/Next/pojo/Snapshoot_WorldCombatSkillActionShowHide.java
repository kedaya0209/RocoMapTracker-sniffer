// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record Snapshoot_WorldCombatSkillActionShowHide(
    WorldCombatDotsSkillShowHideInfo showHideInfo
) {
    public static Snapshoot_WorldCombatSkillActionShowHide parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new Snapshoot_WorldCombatSkillActionShowHide(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.WorldCombatDotsSkillShowHideInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static Snapshoot_WorldCombatSkillActionShowHide parseFrom(java.util.List<ProtoField> fields) {
        return new Snapshoot_WorldCombatSkillActionShowHide(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.WorldCombatDotsSkillShowHideInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
