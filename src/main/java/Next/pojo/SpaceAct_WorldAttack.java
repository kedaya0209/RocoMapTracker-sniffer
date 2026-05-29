// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_WorldAttack(
    long actorId,
    int aimType,
    int attackType,
    float range,
    float predict,
    int damage,
    float hitStrength,
    boolean isHeavy,
    long timeStamp,
    long targetActorId,
    SvrAISyncCommonInfo syncCommonInfo,
    boolean useSpecificPos,
    Position specificPos,
    int hitPerformType
) {
    public static SpaceAct_WorldAttack parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_WorldAttack(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readBool(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readInt(fields, 14, 0)
        );
    }
    public static SpaceAct_WorldAttack parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_WorldAttack(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readFloat(fields, 4),
            Pojos.readFloat(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readFloat(fields, 7),
            Pojos.readBool(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readBool(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 13)) : null,
            Pojos.readInt(fields, 14, 0)
        );
    }
}
