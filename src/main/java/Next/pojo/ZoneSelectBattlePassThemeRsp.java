// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSelectBattlePassThemeRsp(
    RetInfo retInfo,
    PlayerBattlePassInfo battlePassInfo
) {
    public static ZoneSelectBattlePassThemeRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSelectBattlePassThemeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBattlePassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSelectBattlePassThemeRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSelectBattlePassThemeRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBattlePassInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
