// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattlePassTaskUpdateNotify(
    PlayerBattlePassTaskInfo taskInfo
) {
    public static ZoneBattlePassTaskUpdateNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattlePassTaskUpdateNotify(
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerBattlePassTaskInfo.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
    public static ZoneBattlePassTaskUpdateNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattlePassTaskUpdateNotify(
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PlayerBattlePassTaskInfo.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
}
