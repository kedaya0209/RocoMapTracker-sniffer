// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomePetFeedCancelReq(
    long npcObjId,
    int petGid
) {
    public static ZoneHomePetFeedCancelReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePetFeedCancelReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneHomePetFeedCancelReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePetFeedCancelReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
