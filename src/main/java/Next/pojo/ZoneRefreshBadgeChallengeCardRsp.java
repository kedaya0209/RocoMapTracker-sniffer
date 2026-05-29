// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneRefreshBadgeChallengeCardRsp(
    List<ChallengeEventCardInfo> eventInfos,
    int remainCoin,
    RetInfo retInfo,
    int refreshNeedCoin,
    List<Integer> petUnitType
) {
    public static ZoneRefreshBadgeChallengeCardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRefreshBadgeChallengeCardRsp(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
    public static ZoneRefreshBadgeChallengeCardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRefreshBadgeChallengeCardRsp(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ChallengeEventCardInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
}
