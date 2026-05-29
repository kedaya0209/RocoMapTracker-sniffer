// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReceiveBattlePassRewardRsp(
    RetInfo retInfo,
    PlayerBattlePassInfo battlePassInfo
) {
    public static ZoneReceiveBattlePassRewardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceiveBattlePassRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBattlePassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneReceiveBattlePassRewardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceiveBattlePassRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBattlePassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
