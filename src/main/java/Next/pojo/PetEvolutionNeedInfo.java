// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetEvolutionNeedInfo(
    List<DefeatInfo> defeatInfo,
    List<InteractInfo> interactInfo,
    int battleStarLightValue
) {
    public static PetEvolutionNeedInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetEvolutionNeedInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DefeatInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.InteractInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
    public static PetEvolutionNeedInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetEvolutionNeedInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DefeatInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.InteractInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
}
