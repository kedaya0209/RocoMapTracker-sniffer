// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetMobileBindingRewardRsp(
    RetInfo retInfo,
    PlayerMobileBindData mobileBindInfo
) {
    public static ZoneGetMobileBindingRewardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetMobileBindingRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerMobileBindData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static ZoneGetMobileBindingRewardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetMobileBindingRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerMobileBindData.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
