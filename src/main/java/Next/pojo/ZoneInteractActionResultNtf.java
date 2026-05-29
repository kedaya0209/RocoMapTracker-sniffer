// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneInteractActionResultNtf(
    int actType,
    boolean avatarHpChange,
    boolean petOrChargeBagItemChange
) {
    public static ZoneInteractActionResultNtf parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneInteractActionResultNtf(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneInteractActionResultNtf parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneInteractActionResultNtf(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
