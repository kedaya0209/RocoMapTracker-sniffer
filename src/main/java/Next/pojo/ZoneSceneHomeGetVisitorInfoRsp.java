// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneHomeGetVisitorInfoRsp(
    RetInfo retInfo,
    int homeOwnerId,
    List<HomeVisitorInfo> visitorInfo
) {
    public static ZoneSceneHomeGetVisitorInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeGetVisitorInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HomeVisitorInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneHomeGetVisitorInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeGetVisitorInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HomeVisitorInfo::parseFrom).toList()
        );
    }
}
