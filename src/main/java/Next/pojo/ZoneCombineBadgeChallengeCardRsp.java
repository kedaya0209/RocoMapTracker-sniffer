// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneCombineBadgeChallengeCardRsp(
    List<ChallengeEventCardInfo> eventInfos,
    RetInfo retInfo
) {
    public static ZoneCombineBadgeChallengeCardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCombineBadgeChallengeCardRsp(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneCombineBadgeChallengeCardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCombineBadgeChallengeCardRsp(
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
