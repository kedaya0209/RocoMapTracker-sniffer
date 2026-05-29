// Generated from com_recharge.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ChargeInfo(
    int moneyNum,
    long chargeTimes,
    long lastUpdateTime
) {
    public static ChargeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ChargeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ChargeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ChargeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
