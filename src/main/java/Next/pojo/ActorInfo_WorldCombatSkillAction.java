// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_WorldCombatSkillAction(
    String GUID,
    float skillBeginTime,
    int skillActionType,
    Snapshoot_WorldCombatSkillActionJump jumpSnapshoot,
    Snapshoot_WorldCombatSkillActionRcd rcdSnapshoot,
    Snapshoot_WorldCombatSkillActionMissile missileSnapshoot,
    Snapshoot_WorldCombatSkillActionCrush crushSnapshoot,
    Snapshoot_WorldCombatSkillActionShowHide showHideSnapshoot
) {
    public static ActorInfo_WorldCombatSkillAction parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_WorldCombatSkillAction(
            Pojos.readString(fields, 1),
            Pojos.readFloat(fields, 2),
            Pojos.readInt(fields, 10, 0),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionJump.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionRcd.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionMissile.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionCrush.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionShowHide.parseFrom(Pojos.readMessage(fields, 15)) : null
        );
    }
    public static ActorInfo_WorldCombatSkillAction parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_WorldCombatSkillAction(
            Pojos.readString(fields, 1),
            Pojos.readFloat(fields, 2),
            Pojos.readInt(fields, 10, 0),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionJump.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionRcd.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 13) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionMissile.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionCrush.parseFrom(Pojos.readMessage(fields, 14)) : null,
            Pojos.readMessage(fields, 15) != null ? Next.pojo.Snapshoot_WorldCombatSkillActionShowHide.parseFrom(Pojos.readMessage(fields, 15)) : null
        );
    }
}
