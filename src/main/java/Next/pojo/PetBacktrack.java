// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetBacktrack(
    long lastBacktrackTime,
    PetBriefInfo snapShot,
    List<PetUsedItems> usedItems,
    int expFromItem,
    int petGid,
    int lastBreakthroughLv,
    int growTimes,
    int inspireLv,
    boolean snapshotWriteDb
) {
    public static PetBacktrack parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetBacktrack(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetUsedItems::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
    public static PetBacktrack parseFrom(java.util.List<ProtoField> fields) {
        return new PetBacktrack(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetUsedItems::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
}
