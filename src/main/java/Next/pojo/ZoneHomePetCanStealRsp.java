// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomePetCanStealRsp(
    RetInfo retInfo,
    boolean canSteal,
    int reason
) {
    public static ZoneHomePetCanStealRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePetCanStealRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneHomePetCanStealRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePetCanStealRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
