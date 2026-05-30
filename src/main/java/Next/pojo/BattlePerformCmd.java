// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattlePerformCmd(
    boolean isBattleFinished,
    List<BattlePerformInfo> performInfo,
    int round,
    BattleBloodPetSkill bloodPetSkills,
    int seqNum,
    int svrEstimateTime
) {
    public static BattlePerformCmd parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePerformCmd(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattlePerformInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleBloodPetSkill.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static BattlePerformCmd parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePerformCmd(
            Pojos.readBool(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattlePerformInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleBloodPetSkill.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
