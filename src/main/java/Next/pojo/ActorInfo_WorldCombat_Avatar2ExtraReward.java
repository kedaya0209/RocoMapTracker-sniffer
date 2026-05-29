// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_WorldCombat_Avatar2ExtraReward(
    long avatarId,
    List<WorldCombatExtraRewardInfo> extraRewardList
) {
    public static ActorInfo_WorldCombat_Avatar2ExtraReward parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_WorldCombat_Avatar2ExtraReward(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList()
        );
    }
    public static ActorInfo_WorldCombat_Avatar2ExtraReward parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_WorldCombat_Avatar2ExtraReward(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList()
        );
    }
}
