// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetBoxSetMarkTypeReq(
    int boxId,
    int markType,
    String boxName
) {
    public static ZonePetBoxSetMarkTypeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBoxSetMarkTypeReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readString(fields, 3)
        );
    }
    public static ZonePetBoxSetMarkTypeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBoxSetMarkTypeReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readString(fields, 3)
        );
    }
}
