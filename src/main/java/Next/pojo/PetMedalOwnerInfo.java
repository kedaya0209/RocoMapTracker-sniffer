// Generated from com_pet_medal.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetMedalOwnerInfo(
    int ownerId,
    int medalGid,
    List<PetMedalOwnerTaskInfo> taskInfos,
    int completeCnt,
    PetMedalExt medalExt
) {
    public static PetMedalOwnerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalOwnerInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetMedalOwnerTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static PetMedalOwnerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalOwnerInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetMedalOwnerTaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
