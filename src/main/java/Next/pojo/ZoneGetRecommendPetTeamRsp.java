// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetRecommendPetTeamRsp(
    RetInfo retInfo,
    List<RecommendPetTeamInfo> recommendPetTeam
) {
    public static ZoneGetRecommendPetTeamRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetRecommendPetTeamRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RecommendPetTeamInfo::parseFrom).toList()
        );
    }
    public static ZoneGetRecommendPetTeamRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetRecommendPetTeamRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RecommendPetTeamInfo::parseFrom).toList()
        );
    }
}
