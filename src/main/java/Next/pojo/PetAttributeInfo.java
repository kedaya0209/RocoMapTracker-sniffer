// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetAttributeInfo(
    PetAttributeData hp,
    PetAttributeData attack,
    PetAttributeData specialAttack,
    PetAttributeData defense,
    PetAttributeData specialDefense,
    PetAttributeData speed,
    List<Integer> breakEnhanceEnum
) {
    public static PetAttributeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetAttributeInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readIntList(fields, 8)
        );
    }
    public static PetAttributeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetAttributeInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PetAttributeData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readIntList(fields, 8)
        );
    }
}
