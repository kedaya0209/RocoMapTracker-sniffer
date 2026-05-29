// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetBattlePassInfoRsp(
    RetInfo retInfo,
    PlayerBattlePassInfo battlePassInfo,
    PlayerBattlePassBriefInfo battlePassBriefInfo
) {
    public static ZoneGetBattlePassInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetBattlePassInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBattlePassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerBattlePassBriefInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneGetBattlePassInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetBattlePassInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBattlePassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerBattlePassBriefInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
