// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedGetCtrlDataRsp(
    RetInfo retInfo,
    ZoneFeedCtrlData data
) {
    public static ZoneFeedGetCtrlDataRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedGetCtrlDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneFeedCtrlData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneFeedGetCtrlDataRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedGetCtrlDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ZoneFeedCtrlData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
