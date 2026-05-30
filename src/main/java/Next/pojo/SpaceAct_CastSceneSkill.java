// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_CastSceneSkill(
    long casterId,
    long timeStamp,
    int skillId,
    int skillStatusType,
    boolean isAddStatus
) {
    public static SpaceAct_CastSceneSkill parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_CastSceneSkill(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
    public static SpaceAct_CastSceneSkill parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_CastSceneSkill(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
}
