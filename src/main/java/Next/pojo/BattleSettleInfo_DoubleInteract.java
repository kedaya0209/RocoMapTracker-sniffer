// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleSettleInfo_DoubleInteract(
    int type,
    int mateUin,
    String mateName,
    long zoneInstId,
    boolean isMateCreater,
    int mateLevel
) {
    public static BattleSettleInfo_DoubleInteract parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSettleInfo_DoubleInteract(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static BattleSettleInfo_DoubleInteract parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSettleInfo_DoubleInteract(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
