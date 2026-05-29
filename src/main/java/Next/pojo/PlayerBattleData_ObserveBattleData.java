// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBattleData_ObserveBattleData(
    int uin,
    long flag,
    PlayerSceneInfo backupScene
) {
    public static PlayerBattleData_ObserveBattleData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattleData_ObserveBattleData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSceneInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static PlayerBattleData_ObserveBattleData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattleData_ObserveBattleData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerSceneInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
