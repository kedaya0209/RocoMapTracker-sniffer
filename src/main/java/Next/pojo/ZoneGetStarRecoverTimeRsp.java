// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetStarRecoverTimeRsp(
    int nextRecoverTime,
    int totalRecoverTime,
    RetInfo retInfo
) {
    public static ZoneGetStarRecoverTimeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetStarRecoverTimeRsp(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneGetStarRecoverTimeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetStarRecoverTimeRsp(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
