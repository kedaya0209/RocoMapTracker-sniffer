// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetLevelAwardReq(
    int level
) {
    public static ZoneGetLevelAwardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetLevelAwardReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneGetLevelAwardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetLevelAwardReq(
            Pojos.readInt(fields, 1)
        );
    }
}
