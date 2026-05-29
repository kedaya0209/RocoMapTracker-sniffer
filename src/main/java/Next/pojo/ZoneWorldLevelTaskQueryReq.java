// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneWorldLevelTaskQueryReq(
    int worldLevelTaskId
) {
    public static ZoneWorldLevelTaskQueryReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneWorldLevelTaskQueryReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneWorldLevelTaskQueryReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneWorldLevelTaskQueryReq(
            Pojos.readInt(fields, 1)
        );
    }
}
