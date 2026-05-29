// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleChangeModel(
    int petId,
    int oldBaseId,
    BattlePetInfo petInfo,
    int roleMagicFlag
) {
    public static BattleChangeModel parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleChangeModel(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattlePetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
    public static BattleChangeModel parseFrom(java.util.List<ProtoField> fields) {
        return new BattleChangeModel(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattlePetInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
}
