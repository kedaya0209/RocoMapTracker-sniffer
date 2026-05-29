// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerBattlePassInfoNotify(
    PlayerBattlePassInfo battlePassInfo
) {
    public static ZonePlayerBattlePassInfoNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerBattlePassInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerBattlePassInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZonePlayerBattlePassInfoNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerBattlePassInfoNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerBattlePassInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
