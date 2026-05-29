// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetSpecialityCondCheck(
    int specialityId,
    int petGid,
    boolean noScene,
    boolean canDo
) {
    public static PetSpecialityCondCheck parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetSpecialityCondCheck(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static PetSpecialityCondCheck parseFrom(java.util.List<ProtoField> fields) {
        return new PetSpecialityCondCheck(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
