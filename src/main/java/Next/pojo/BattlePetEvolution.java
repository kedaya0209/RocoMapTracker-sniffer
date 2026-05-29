// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattlePetEvolution(
    int petId,
    BattlePetInfo petInfo
) {
    public static BattlePetEvolution parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePetEvolution(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattlePetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static BattlePetEvolution parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePetEvolution(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattlePetInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
