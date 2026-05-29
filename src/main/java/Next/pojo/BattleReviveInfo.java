// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleReviveInfo(
    int casterId,
    BattlePetInfo pet,
    int uin
) {
    public static BattleReviveInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleReviveInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattlePetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
    public static BattleReviveInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleReviveInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattlePetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
}
