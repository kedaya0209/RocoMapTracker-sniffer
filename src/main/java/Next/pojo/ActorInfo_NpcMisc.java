// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_NpcMisc(
    long throwId,
    boolean cannotBeSeen,
    List<WorldCombatExtraRewardInfo> boxExtraRewardInfoList,
    long npcHideFlag
) {
    public static ActorInfo_NpcMisc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcMisc(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList(),
            Pojos.readLong(fields, 4)
        );
    }
    public static ActorInfo_NpcMisc parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcMisc(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList(),
            Pojos.readLong(fields, 4)
        );
    }
}
