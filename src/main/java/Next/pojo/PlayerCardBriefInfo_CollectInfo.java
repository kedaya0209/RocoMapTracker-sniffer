// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerCardBriefInfo_CollectInfo(
    List<PlayerCardBriefInfo_CollectPetInfo> cardModulePetInfos,
    List<PlayerCardBriefInfo_CollectFashionInfo> cardModuleFashionInfos
) {
    public static PlayerCardBriefInfo_CollectInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCardBriefInfo_CollectInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerCardBriefInfo_CollectPetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerCardBriefInfo_CollectFashionInfo::parseFrom).toList()
        );
    }
    public static PlayerCardBriefInfo_CollectInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCardBriefInfo_CollectInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerCardBriefInfo_CollectPetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerCardBriefInfo_CollectFashionInfo::parseFrom).toList()
        );
    }
}
