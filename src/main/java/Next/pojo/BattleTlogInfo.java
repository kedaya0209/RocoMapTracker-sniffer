// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleTlogInfo(
    int gamesvId,
    byte[] gameappId,
    int platId,
    int worldId,
    byte[] openId,
    int level,
    Position pos,
    int areaId
) {
    public static BattleTlogInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleTlogInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8)
        );
    }
    public static BattleTlogInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleTlogInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8)
        );
    }
}
