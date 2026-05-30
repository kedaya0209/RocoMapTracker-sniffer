// Generated from com_pet_medal.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetMedalDetail(
    int ownerId,
    int addTime,
    boolean isWear,
    int completeCnt,
    int obtainPetGid,
    byte[] obtainPetName,
    int wearPetGid,
    PetMedalExt extData
) {
    public static PetMedalDetail parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalDetail(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
    public static PetMedalDetail parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalDetail(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
}
