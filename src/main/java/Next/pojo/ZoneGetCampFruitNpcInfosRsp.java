// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetCampFruitNpcInfosRsp(
    RetInfo retInfo,
    List<CampFruitNpcInfo> campFruitNpcInfos
) {
    public static ZoneGetCampFruitNpcInfosRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetCampFruitNpcInfosRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CampFruitNpcInfo::parseFrom).toList()
        );
    }
    public static ZoneGetCampFruitNpcInfosRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetCampFruitNpcInfosRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CampFruitNpcInfo::parseFrom).toList()
        );
    }
}
