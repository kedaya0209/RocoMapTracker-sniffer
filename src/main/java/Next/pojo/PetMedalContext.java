// Generated from com_pet_medal.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetMedalContext(
    int ownerId,
    List<PetMedalCondTask> tasks,
    PetMedalExt extData,
    List<Integer> killPetChainList
) {
    public static PetMedalContext parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalContext(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetMedalCondTask::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readIntList(fields, 4)
        );
    }
    public static PetMedalContext parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalContext(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetMedalCondTask::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readIntList(fields, 4)
        );
    }
}
