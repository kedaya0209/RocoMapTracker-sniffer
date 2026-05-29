// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetStartArg(
    int petId,
    int bloodId,
    List<Integer> skills,
    int enterIndex,
    int nature,
    int height,
    int weight,
    int gender,
    int breakthroughCnt,
    int hpMaxTalent,
    int phyAttackTalent,
    int speAttackTalent,
    int phyDefenceTalent,
    int speDefenceTalent,
    int speedTalent
) {
    public static PetStartArg parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetStartArg(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15)
        );
    }
    public static PetStartArg parseFrom(java.util.List<ProtoField> fields) {
        return new PetStartArg(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15)
        );
    }
}
