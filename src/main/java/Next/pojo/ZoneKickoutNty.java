// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneKickoutNty(
    int kickoutType,
    int kickoutSubType,
    MultiLangPb kickoutMsg,
    String kickoutTxtId,
    BanInfo banInfo
) {
    public static ZoneKickoutNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneKickoutNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MultiLangPb.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readString(fields, 5),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneKickoutNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneKickoutNty(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MultiLangPb.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readString(fields, 5),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
