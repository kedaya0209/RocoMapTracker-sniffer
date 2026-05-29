// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TogetherCatchInfo(
    boolean isCatchTogether,
    boolean isOnwerCatch,
    int relatedUin,
    byte[] relatedName,
    int catchTime,
    int transferDeadline,
    int catchedUin,
    byte[] catchedName,
    List<Integer> carriedMedals,
    int wornNonAutoMedal
) {
    public static TogetherCatchInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TogetherCatchInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readIntList(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
    public static TogetherCatchInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TogetherCatchInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readIntList(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
}
