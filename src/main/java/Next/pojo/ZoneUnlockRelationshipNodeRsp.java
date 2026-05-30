// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUnlockRelationshipNodeRsp(
    RetInfo retInfo,
    int peerUin,
    int relationshipType,
    BanInfo banInfo
) {
    public static ZoneUnlockRelationshipNodeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUnlockRelationshipNodeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneUnlockRelationshipNodeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUnlockRelationshipNodeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
