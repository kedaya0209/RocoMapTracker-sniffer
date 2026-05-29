// Generated from com_pet_egg.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetEggData(
    PetEggBrief eggBrief,
    PetEggCore eggCore
) {
    public static PetEggData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetEggData(
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PetEggBrief.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PetEggCore.parseFrom(Pojos.readMessage(fields, 16)) : null
        );
    }
    public static PetEggData parseFrom(java.util.List<ProtoField> fields) {
        return new PetEggData(
            Pojos.readMessage(fields, 15) != null ? Next.pojo.PetEggBrief.parseFrom(Pojos.readMessage(fields, 15)) : null,
            Pojos.readMessage(fields, 16) != null ? Next.pojo.PetEggCore.parseFrom(Pojos.readMessage(fields, 16)) : null
        );
    }
}
