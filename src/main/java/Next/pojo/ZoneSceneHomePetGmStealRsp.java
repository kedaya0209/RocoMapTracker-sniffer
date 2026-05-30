// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneHomePetGmStealRsp(
    RetInfo retInfo,
    List<HomePetGmStealInfo> stealInfo
) {
    public static ZoneSceneHomePetGmStealRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomePetGmStealRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HomePetGmStealInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneHomePetGmStealRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomePetGmStealRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HomePetGmStealInfo::parseFrom).toList()
        );
    }
}
