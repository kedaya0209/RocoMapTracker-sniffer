// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_WorldCombat(
    int worldCombatId,
    int worldCombatCfgId,
    List<Long> avatarId,
    int worldCombatPhase,
    List<ActorInfo_WorldCombat_Avatar2ExtraReward> extraRewardInfo
) {
    public static ActorInfo_WorldCombat parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_WorldCombat(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLongList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ActorInfo_WorldCombat_Avatar2ExtraReward::parseFrom).toList()
        );
    }
    public static ActorInfo_WorldCombat parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_WorldCombat(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLongList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ActorInfo_WorldCombat_Avatar2ExtraReward::parseFrom).toList()
        );
    }
}
