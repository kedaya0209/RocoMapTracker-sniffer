// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedMagicCreateReq(
    int uin,
    String content,
    Position createPos,
    String extInfo,
    int musicId
) {
    public static ZoneFeedMagicCreateReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedMagicCreateReq(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneFeedMagicCreateReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedMagicCreateReq(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
