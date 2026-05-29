// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BeastBattleAchieves(
    int achieveType,
    List<Integer> achieveValues,
    int rewardBallNum,
    int cfgId
) {
    public static BeastBattleAchieves parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BeastBattleAchieves(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static BeastBattleAchieves parseFrom(java.util.List<ProtoField> fields) {
        return new BeastBattleAchieves(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
