// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneLotteryRewardResultNotify(
    RetInfo retInfo,
    int lotteryItem,
    long transId,
    int lotteryResult
) {
    public static ZoneLotteryRewardResultNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneLotteryRewardResultNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneLotteryRewardResultNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneLotteryRewardResultNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
