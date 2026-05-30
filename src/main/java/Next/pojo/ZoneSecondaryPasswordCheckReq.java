// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSecondaryPasswordCheckReq(
    int action,
    byte[] encodeSecondaryPassword,
    byte[] oldEncodeSecondaryPassword,
    int passAction,
    byte[] publicKeyMd5,
    int defaultFree
) {
    public static ZoneSecondaryPasswordCheckReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSecondaryPasswordCheckReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static ZoneSecondaryPasswordCheckReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSecondaryPasswordCheckReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
