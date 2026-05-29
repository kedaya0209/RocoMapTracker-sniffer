// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneOnlineVisitorInfoNotify(
    List<VisitorInfo> visitorInfo
) {
    public static ZoneSceneOnlineVisitorInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneOnlineVisitorInfoNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.VisitorInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneOnlineVisitorInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneOnlineVisitorInfoNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.VisitorInfo::parseFrom).toList()
        );
    }
}
