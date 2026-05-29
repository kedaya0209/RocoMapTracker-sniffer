// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TrialPetBrief(
    int libraryId,
    int refreshTime,
    List<Integer> unitType,
    int version
) {
    public static TrialPetBrief parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TrialPetBrief(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static TrialPetBrief parseFrom(java.util.List<ProtoField> fields) {
        return new TrialPetBrief(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
