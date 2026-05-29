// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PkPetData(
    boolean adjusted,
    PetData petData,
    int baseConfId
) {
    public static PkPetData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PkPetData(
            Pojos.readBool(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
    public static PkPetData parseFrom(java.util.List<ProtoField> fields) {
        return new PkPetData(
            Pojos.readBool(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3)
        );
    }
}
