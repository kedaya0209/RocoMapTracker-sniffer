// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSelectBadgeChallengeCardRsp(
    List<ChallengeEventCardInfo> eventInfos,
    RetInfo retInfo
) {
    public static ZoneSelectBadgeChallengeCardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSelectBadgeChallengeCardRsp(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSelectBadgeChallengeCardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSelectBadgeChallengeCardRsp(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
