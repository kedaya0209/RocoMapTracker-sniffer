// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetBackpackInfo(
    List<Integer> eggGid,
    List<PetBox> boxes,
    int lastOpenBoxId,
    long markUnlockInfo
) {
    public static PetBackpackInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetBackpackInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetBox::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static PetBackpackInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetBackpackInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetBox::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
