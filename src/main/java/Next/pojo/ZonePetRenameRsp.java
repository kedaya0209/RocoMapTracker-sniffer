// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetRenameRsp(
    RetInfo retInfo,
    BanInfo banInfo
) {
    public static ZonePetRenameRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetRenameRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZonePetRenameRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetRenameRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
