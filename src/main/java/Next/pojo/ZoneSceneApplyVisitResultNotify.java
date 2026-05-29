// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneApplyVisitResultNotify(
    RetInfo retInfo,
    byte[] ownerName,
    boolean agree,
    int ownerUin
) {
    public static ZoneSceneApplyVisitResultNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneApplyVisitResultNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneSceneApplyVisitResultNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneApplyVisitResultNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
