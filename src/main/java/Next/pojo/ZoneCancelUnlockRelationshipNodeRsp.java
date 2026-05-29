// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneCancelUnlockRelationshipNodeRsp(
    RetInfo retInfo,
    int peerUin,
    int relationshipType
) {
    public static ZoneCancelUnlockRelationshipNodeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCancelUnlockRelationshipNodeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneCancelUnlockRelationshipNodeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCancelUnlockRelationshipNodeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
