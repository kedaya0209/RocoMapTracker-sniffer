// Generated from com_pet_medal.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetMedal(
    int confId,
    int hashId,
    PetMedalDetail detail
) {
    public static PetMedal parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedal(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetMedalDetail.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static PetMedal parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedal(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetMedalDetail.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
