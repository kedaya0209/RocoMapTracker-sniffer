// Generated from com_pet_medal.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetMedalCondTask(
    int id,
    int count
) {
    public static PetMedalCondTask parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalCondTask(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PetMedalCondTask parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalCondTask(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
