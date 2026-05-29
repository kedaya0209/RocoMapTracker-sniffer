// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AvatarWorldCombatInfo(
    long combatNpc,
    List<WorldCombatExtraRewardInfo> extraRewardList,
    long combatNpcLogicId,
    List<AvatarWorldCombatInfoAward> awards,
    List<Long> defeatedBossContentList
) {
    public static AvatarWorldCombatInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarWorldCombatInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.AvatarWorldCombatInfoAward::parseFrom).toList(),
            Pojos.readLongList(fields, 5)
        );
    }
    public static AvatarWorldCombatInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarWorldCombatInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.AvatarWorldCombatInfoAward::parseFrom).toList(),
            Pojos.readLongList(fields, 5)
        );
    }
}
