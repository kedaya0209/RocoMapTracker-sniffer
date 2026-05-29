// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerPetMedalInfo(
    List<PetMedalInfo> medalInfos,
    List<PetMedalRecord> collection,
    List<PetMedalAddi> addiInfo,
    List<PetCertiMedalHistory> petCertiHistory
) {
    public static PlayerPetMedalInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPetMedalInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetMedalInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetMedalRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetMedalAddi::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PetCertiMedalHistory::parseFrom).toList()
        );
    }
    public static PlayerPetMedalInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPetMedalInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetMedalInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetMedalRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetMedalAddi::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.PetCertiMedalHistory::parseFrom).toList()
        );
    }
}
