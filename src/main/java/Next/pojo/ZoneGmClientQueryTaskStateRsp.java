// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmClientQueryTaskStateRsp(
    RetInfo retInfo,
    int state
) {
    public static ZoneGmClientQueryTaskStateRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmClientQueryTaskStateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneGmClientQueryTaskStateRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmClientQueryTaskStateRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2, 0)
        );
    }
}
