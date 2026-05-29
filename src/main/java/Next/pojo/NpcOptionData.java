// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcOptionData(
    int optionId,
    boolean enabled,
    int executableTimes,
    long lastResetTime,
    List<Integer> storyFlags,
    List<NpcOptionData_SelectInfo> selectInfos,
    NpcOptionData_ActionInfo curActionInfo,
    List<Integer> removedSelectIds,
    boolean resetAfterInteract,
    List<Integer> curSelectedSelectIds,
    boolean decExecutableTimesAfterInteract,
    boolean ignoreReset,
    int trigInteractType,
    int enableOptGid,
    int succExecTimes,
    int firstDialogId,
    int petInteractId,
    long interactAvatarId,
    long directInteractActorId,
    long exhaustedTime,
    int trigInteractPetGid,
    List<Integer> optionParams,
    List<Integer> dialogBeginParams,
    boolean taskDisableFlag,
    int dynamicSelectId,
    NpcOptionExtraData extraData,
    boolean needPermanentNpc
) {
    public static NpcOptionData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcOptionData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.NpcOptionData_SelectInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.NpcOptionData_ActionInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readIntList(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readLong(fields, 21),
            Pojos.readLong(fields, 22),
            Pojos.readLong(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readIntList(fields, 27),
            Pojos.readIntList(fields, 28),
            Pojos.readBool(fields, 29),
            Pojos.readInt(fields, 30),
            Pojos.readMessage(fields, 31) != null ? Next.pojo.NpcOptionExtraData.parseFrom(Pojos.readMessage(fields, 31)) : null,
            Pojos.readBool(fields, 32)
        );
    }
    public static NpcOptionData parseFrom(java.util.List<ProtoField> fields) {
        return new NpcOptionData(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.NpcOptionData_SelectInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.NpcOptionData_ActionInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readIntList(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readLong(fields, 21),
            Pojos.readLong(fields, 22),
            Pojos.readLong(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readIntList(fields, 27),
            Pojos.readIntList(fields, 28),
            Pojos.readBool(fields, 29),
            Pojos.readInt(fields, 30),
            Pojos.readMessage(fields, 31) != null ? Next.pojo.NpcOptionExtraData.parseFrom(Pojos.readMessage(fields, 31)) : null,
            Pojos.readBool(fields, 32)
        );
    }
}
