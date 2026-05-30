// Generated from com_player_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBattleBriefInfo(
    int battleState,
    long battlesvrBusppInstId,
    long bfdId,
    int battleConfId
) {
    public static PlayerBattleBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattleBriefInfo(
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 1)
        );
    }
    public static PlayerBattleBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattleBriefInfo(
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 1)
        );
    }
}
