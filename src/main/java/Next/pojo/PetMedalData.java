// Generated from com_pet_medal.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetMedalData(
    int confId,
    int medalType,
    boolean isWear,
    int completeCnt,
    int obtainPetGid,
    byte[] obtainPetName,
    int ownerId,
    int wearPetGid,
    PetMedalExt extData
) {
    public static PetMedalData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
    public static PetMedalData parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 11)) : null
        );
    }
}
