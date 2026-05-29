// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneHomePetUnplaceRsp(
    RetInfo retInfo,
    List<HomePetInfo> homePetInfoList
) {
    public static ZoneHomePetUnplaceRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePetUnplaceRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HomePetInfo::parseFrom).toList()
        );
    }
    public static ZoneHomePetUnplaceRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePetUnplaceRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HomePetInfo::parseFrom).toList()
        );
    }
}
