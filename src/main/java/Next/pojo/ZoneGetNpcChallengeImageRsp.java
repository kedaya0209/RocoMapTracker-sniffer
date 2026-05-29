// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetNpcChallengeImageRsp(
    RetInfo retInfo,
    List<BattleAppearanceInfo> npcChallengeImageInfo
) {
    public static ZoneGetNpcChallengeImageRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetNpcChallengeImageRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleAppearanceInfo::parseFrom).toList()
        );
    }
    public static ZoneGetNpcChallengeImageRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetNpcChallengeImageRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleAppearanceInfo::parseFrom).toList()
        );
    }
}
