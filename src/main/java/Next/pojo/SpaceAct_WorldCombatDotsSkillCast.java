// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_WorldCombatDotsSkillCast(
    long actorId,
    WorldCombatDotsSkillCastInfo skillCastInfo,
    Point castPoint,
    boolean isNeedSyncPos
) {
    public static SpaceAct_WorldCombatDotsSkillCast parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldCombatDotsSkillCast(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatDotsSkillCastInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4)
        );
    }
    public static SpaceAct_WorldCombatDotsSkillCast parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldCombatDotsSkillCast(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.WorldCombatDotsSkillCastInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4)
        );
    }
}
