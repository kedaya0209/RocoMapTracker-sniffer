// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneStartBadgeChallengeRsp(
    List<ChallengeEventCardInfo> eventInfos,
    RetInfo retInfo,
    int remainCoin,
    int refreshNeedCoin,
    List<ChallengeEventCardInfo> levelInfos
) {
    public static ZoneStartBadgeChallengeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneStartBadgeChallengeRsp(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList()
        );
    }
    public static ZoneStartBadgeChallengeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneStartBadgeChallengeRsp(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList()
        );
    }
}
