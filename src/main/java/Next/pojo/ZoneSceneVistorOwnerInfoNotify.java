// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneVistorOwnerInfoNotify(
    int ownerUin,
    int pvpRankStar
) {
    public static ZoneSceneVistorOwnerInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneVistorOwnerInfoNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSceneVistorOwnerInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneVistorOwnerInfoNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
