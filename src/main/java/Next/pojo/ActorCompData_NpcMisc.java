// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NpcMisc(
    int belongPetGid,
    String magicChangeAvatarName,
    int ballCfgId,
    long throwId,
    long canBeSeenAvatarId,
    PedalData pedalData,
    boolean cannotBeSeen,
    List<Integer> worldCombatBoxExtraRewardList,
    int aiOverridePerformGroupId,
    List<WorldCombatExtraRewardInfo> boxExtraRewardInfoList,
    int petCatchedBallId,
    long npcHideFlag,
    List<Integer> propertyTypes,
    boolean isFixed
) {
    public static ActorCompData_NpcMisc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NpcMisc(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PedalData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readBool(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList(),
            Pojos.readInt(fields, 11),
            Pojos.readLong(fields, 13),
            Pojos.readIntList(fields, 31),
            Pojos.readBool(fields, 32)
        );
    }
    public static ActorCompData_NpcMisc parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NpcMisc(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PedalData.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readBool(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.WorldCombatExtraRewardInfo::parseFrom).toList(),
            Pojos.readInt(fields, 11),
            Pojos.readLong(fields, 13),
            Pojos.readIntList(fields, 31),
            Pojos.readBool(fields, 32)
        );
    }
}
