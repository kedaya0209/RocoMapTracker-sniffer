// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSecondaryPasswordGetAuthInfoRsp(
    RetInfo retInfo,
    byte[] salting,
    byte[] publicKey,
    byte[] publicKeyMd5,
    byte[] sequence,
    int status,
    int statusTimestamp,
    int defaultFree,
    int waitingDuration
) {
    public static ZoneSecondaryPasswordGetAuthInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSecondaryPasswordGetAuthInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6, 0),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static ZoneSecondaryPasswordGetAuthInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSecondaryPasswordGetAuthInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6, 0),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
