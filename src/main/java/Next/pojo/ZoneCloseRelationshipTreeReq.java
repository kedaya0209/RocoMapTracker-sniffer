// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneCloseRelationshipTreeReq(
    int peerUin
) {
    public static ZoneCloseRelationshipTreeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCloseRelationshipTreeReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneCloseRelationshipTreeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCloseRelationshipTreeReq(
            Pojos.readInt(fields, 1)
        );
    }
}
