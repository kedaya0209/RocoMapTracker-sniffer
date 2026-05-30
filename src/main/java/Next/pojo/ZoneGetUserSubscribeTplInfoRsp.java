// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetUserSubscribeTplInfoRsp(
    RetInfo retInfo,
    List<UserSubscribeTplInfo> tplInfoList,
    String openlink
) {
    public static ZoneGetUserSubscribeTplInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetUserSubscribeTplInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.UserSubscribeTplInfo::parseFrom).toList(),
            Pojos.readString(fields, 3)
        );
    }
    public static ZoneGetUserSubscribeTplInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetUserSubscribeTplInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.UserSubscribeTplInfo::parseFrom).toList(),
            Pojos.readString(fields, 3)
        );
    }
}
