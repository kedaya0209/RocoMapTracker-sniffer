// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattlePetPackInfo(
    List<PackPetInfo> pets
) {
    public static BattlePetPackInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePetPackInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PackPetInfo::parseFrom).toList()
        );
    }
    public static BattlePetPackInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePetPackInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PackPetInfo::parseFrom).toList()
        );
    }
}
