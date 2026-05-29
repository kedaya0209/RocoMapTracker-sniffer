// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MonsterCatchGuaranteeInfo(
    long npcObjId,
    long lastCatchTime,
    int catchGuaranteeRate
) {
    public static MonsterCatchGuaranteeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MonsterCatchGuaranteeInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static MonsterCatchGuaranteeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MonsterCatchGuaranteeInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
