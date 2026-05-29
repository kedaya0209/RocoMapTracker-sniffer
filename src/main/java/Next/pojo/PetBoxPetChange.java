// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetBoxPetChange(
    int petGid,
    boolean isInTeam,
    int id,
    int pos
) {
    public static PetBoxPetChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetBoxPetChange(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static PetBoxPetChange parseFrom(java.util.List<ProtoField> fields) {
        return new PetBoxPetChange(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
