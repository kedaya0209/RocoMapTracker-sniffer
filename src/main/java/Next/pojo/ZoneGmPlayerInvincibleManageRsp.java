// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmPlayerInvincibleManageRsp(
    RetInfo retInfo
) {
    public static ZoneGmPlayerInvincibleManageRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmPlayerInvincibleManageRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneGmPlayerInvincibleManageRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmPlayerInvincibleManageRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
