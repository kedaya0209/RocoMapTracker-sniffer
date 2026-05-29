// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActivityPartnerPetData(
    byte[] name,
    int addTime,
    int catchLv,
    int caughtCamp,
    int catchWay,
    byte[] catchVisitOwnerName,
    byte[] natureDesc,
    PetKeyExperience keyExperience,
    PetClosenessInfo closenessInfo,
    TogetherCatchInfo togetherCatchInfo,
    int petBaseId,
    int height,
    int weight
) {
    public static ActivityPartnerPetData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActivityPartnerPetData(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PetKeyExperience.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PetClosenessInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.TogetherCatchInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13)
        );
    }
    public static ActivityPartnerPetData parseFrom(java.util.List<ProtoField> fields) {
        return new ActivityPartnerPetData(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.PetKeyExperience.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PetClosenessInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readMessage(fields, 10) != null ? Next.pojo.TogetherCatchInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13)
        );
    }
}
