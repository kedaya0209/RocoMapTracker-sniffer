// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleSupplyPetInfo(
    int petId,
    int petPos,
    BattlePetInfo petInfo
) {
    public static BattleSupplyPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleSupplyPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattlePetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static BattleSupplyPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleSupplyPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattlePetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
