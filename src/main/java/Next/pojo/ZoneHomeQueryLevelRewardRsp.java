// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneHomeQueryLevelRewardRsp(
    RetInfo retInfo,
    List<RewardState> state
) {
    public static ZoneHomeQueryLevelRewardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeQueryLevelRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RewardState::parseFrom).toList()
        );
    }
    public static ZoneHomeQueryLevelRewardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeQueryLevelRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RewardState::parseFrom).toList()
        );
    }
}
