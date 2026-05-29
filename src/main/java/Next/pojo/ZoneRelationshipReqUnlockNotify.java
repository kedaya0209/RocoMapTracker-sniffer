// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneRelationshipReqUnlockNotify(
    int reqUin,
    int relationshipType
) {
    public static ZoneRelationshipReqUnlockNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRelationshipReqUnlockNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneRelationshipReqUnlockNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRelationshipReqUnlockNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
