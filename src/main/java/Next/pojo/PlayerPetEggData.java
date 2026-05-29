// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerPetEggData(
    List<PetEggCoreRecord> eggCoreRecords
) {
    public static PlayerPetEggData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPetEggData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetEggCoreRecord::parseFrom).toList()
        );
    }
    public static PlayerPetEggData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPetEggData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetEggCoreRecord::parseFrom).toList()
        );
    }
}
