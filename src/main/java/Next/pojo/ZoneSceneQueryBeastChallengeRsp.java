// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneQueryBeastChallengeRsp(
    RetInfo retInfo,
    List<BeastResonanceInfo> resonanceInfos,
    int selectStar,
    int availableChallengeNumViaStar,
    int availableChallengeNumViaStarMax
) {
    public static ZoneSceneQueryBeastChallengeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneQueryBeastChallengeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BeastResonanceInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneSceneQueryBeastChallengeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneQueryBeastChallengeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BeastResonanceInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
