// Generated from com_recharge.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MidasFailfo(
    long chargeVal,
    long billno,
    long tryTimes,
    OssReason reason,
    byte[] billNo,
    int isFinish,
    int lastTryTime,
    int type
) {
    public static MidasFailfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MidasFailfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.OssReason.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static MidasFailfo parseFrom(java.util.List<ProtoField> fields) {
        return new MidasFailfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.OssReason.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
