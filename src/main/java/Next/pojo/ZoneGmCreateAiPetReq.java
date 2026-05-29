// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmCreateAiPetReq(
    int petConfId,
    int bloodId,
    List<Integer> skillIds,
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
    int speedTalent,
    int battleConfId,
    int worldLv,
    int roleLv,
    int npcLv
) {
    public static ZoneGmCreateAiPetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmCreateAiPetReq(
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
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
    public static ZoneGmCreateAiPetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmCreateAiPetReq(
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
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18)
        );
    }
}
