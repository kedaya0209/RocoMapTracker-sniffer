// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneCheckColorSuitStateRsp(
    RetInfo retInfo,
    int colorSuitState
) {
    public static ZoneCheckColorSuitStateRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCheckColorSuitStateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneCheckColorSuitStateRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCheckColorSuitStateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2, 0)
        );
    }
}
