// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetHabitInfo(
    List<PetHabitGroup> habitGroup,
    List<Integer> petTeamHabitIdx
) {
    public static PetHabitInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetHabitInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetHabitGroup::parseFrom).toList(),
            Pojos.readIntList(fields, 2)
        );
    }
    public static PetHabitInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetHabitInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetHabitGroup::parseFrom).toList(),
            Pojos.readIntList(fields, 2)
        );
    }
}
