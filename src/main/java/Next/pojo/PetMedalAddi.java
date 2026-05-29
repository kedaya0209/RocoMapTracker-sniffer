// Generated from com_pet_medal.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetMedalAddi(
    int medalConfId,
    int medalType,
    List<PetMedalContext> contextList
) {
    public static PetMedalAddi parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalAddi(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetMedalContext::parseFrom).toList()
        );
    }
    public static PetMedalAddi parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalAddi(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetMedalContext::parseFrom).toList()
        );
    }
}
