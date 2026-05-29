// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetMobileVeriCodeRsp(
    RetInfo retInfo,
    PlayerMobileBindData mobileBindInfo
) {
    public static ZoneGetMobileVeriCodeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetMobileVeriCodeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerMobileBindData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGetMobileVeriCodeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetMobileVeriCodeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerMobileBindData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
