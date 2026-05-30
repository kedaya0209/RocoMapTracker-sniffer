// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneMobileOpRsp(
    RetInfo retInfo,
    PlayerMobileBindData mobileBindInfo
) {
    public static ZoneMobileOpRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneMobileOpRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerMobileBindData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneMobileOpRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneMobileOpRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerMobileBindData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
