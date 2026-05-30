// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TrialPet(
    TrialPetBrief brief,
    List<PetData> pets
) {
    public static TrialPet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TrialPet(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.TrialPetBrief.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetData::parseFrom).toList()
        );
    }
    public static TrialPet parseFrom(java.util.List<ProtoField> fields) {
        return new TrialPet(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.TrialPetBrief.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetData::parseFrom).toList()
        );
    }
}
