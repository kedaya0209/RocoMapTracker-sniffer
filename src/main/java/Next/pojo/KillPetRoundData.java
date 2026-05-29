// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record KillPetRoundData(
    int curRound,
    int castSkillCount
) {
    public static KillPetRoundData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new KillPetRoundData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static KillPetRoundData parseFrom(java.util.List<ProtoField> fields) {
        return new KillPetRoundData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
