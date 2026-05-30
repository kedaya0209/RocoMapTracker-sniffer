// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmDotsMfbtCastByAssetReq(
    long actorId,
    int behaviorId,
    byte[] behaviorTreeAssetContent
) {
    public static ZoneGmDotsMfbtCastByAssetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmDotsMfbtCastByAssetReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
    public static ZoneGmDotsMfbtCastByAssetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmDotsMfbtCastByAssetReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
}
