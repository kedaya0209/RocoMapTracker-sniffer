// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFeedGetCtrlDataReq(
    int uin
) {
    public static ZoneFeedGetCtrlDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFeedGetCtrlDataReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneFeedGetCtrlDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFeedGetCtrlDataReq(
            Pojos.readInt(fields, 1)
        );
    }
}
