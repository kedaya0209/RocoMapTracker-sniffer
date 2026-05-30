// Generated from com_recharge.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MidasFailRetryPresentInfo(
    long chargeVal,
    long billno,
    long tryTimes,
    OssReason reason,
    byte[] billNo,
    int isFinish
) {
    public static MidasFailRetryPresentInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MidasFailRetryPresentInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.OssReason.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static MidasFailRetryPresentInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MidasFailRetryPresentInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.OssReason.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
