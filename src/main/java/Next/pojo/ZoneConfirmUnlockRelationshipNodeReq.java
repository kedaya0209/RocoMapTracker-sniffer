// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneConfirmUnlockRelationshipNodeReq(
    int peerUin,
    int relationshipType
) {
    public static ZoneConfirmUnlockRelationshipNodeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneConfirmUnlockRelationshipNodeReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneConfirmUnlockRelationshipNodeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneConfirmUnlockRelationshipNodeReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
