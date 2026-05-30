// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetSpecialExData(
    int addTime,
    int catchLv,
    int caughtCamp,
    int catchWay,
    byte[] catchVisitOwnerName,
    byte[] natureDesc,
    PetKeyExperience keyExperience,
    PetClosenessInfo closenessInfo,
    TogetherCatchInfo togetherCatchInfo
) {
    public static PetSpecialExData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetSpecialExData(
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 41),
            Pojos.readInt(fields, 58),
            Pojos.readInt(fields, 67),
            Pojos.readBytes(fields, 68),
            Pojos.readBytes(fields, 69),
            Pojos.readMessage(fields, 70) != null ? Next.pojo.PetKeyExperience.parseFrom(Pojos.readMessage(fields, 70)) : null,
            Pojos.readMessage(fields, 77) != null ? Next.pojo.PetClosenessInfo.parseFrom(Pojos.readMessage(fields, 77)) : null,
            Pojos.readMessage(fields, 90) != null ? Next.pojo.TogetherCatchInfo.parseFrom(Pojos.readMessage(fields, 90)) : null
        );
    }
    public static PetSpecialExData parseFrom(java.util.List<ProtoField> fields) {
        return new PetSpecialExData(
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 41),
            Pojos.readInt(fields, 58),
            Pojos.readInt(fields, 67),
            Pojos.readBytes(fields, 68),
            Pojos.readBytes(fields, 69),
            Pojos.readMessage(fields, 70) != null ? Next.pojo.PetKeyExperience.parseFrom(Pojos.readMessage(fields, 70)) : null,
            Pojos.readMessage(fields, 77) != null ? Next.pojo.PetClosenessInfo.parseFrom(Pojos.readMessage(fields, 77)) : null,
            Pojos.readMessage(fields, 90) != null ? Next.pojo.TogetherCatchInfo.parseFrom(Pojos.readMessage(fields, 90)) : null
        );
    }
}
