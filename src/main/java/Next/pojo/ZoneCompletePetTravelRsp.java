// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneCompletePetTravelRsp(
    RetInfo retInfo
) {
    public static ZoneCompletePetTravelRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCompletePetTravelRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneCompletePetTravelRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCompletePetTravelRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
