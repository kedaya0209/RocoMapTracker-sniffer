// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PlaySkill(
    long actorId,
    String skillPath,
    long curTime,
    long skillId,
    SvrAISyncCommonInfo syncCommonInfo,
    long targetId,
    boolean targetIsNpc,
    boolean useSpecificPos,
    Position specificPos
) {
    public static SpaceAct_PlaySkill parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PlaySkill(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
    public static SpaceAct_PlaySkill parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PlaySkill(
            Pojos.readLong(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readLong(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
}
