// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_NpcOptionInfoChange(
    long npcId,
    int optionId,
    boolean enabled,
    int executableTimes,
    ActorInfo_NpcActionInfo actInfo,
    int enableOptGid,
    int succExecTimes,
    int firstDialogId,
    long avatarId,
    long ineteractingAvatarId
) {
    public static SpaceAct_NpcOptionInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NpcOptionInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ActorInfo_NpcActionInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 10)
        );
    }
    public static SpaceAct_NpcOptionInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NpcOptionInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.ActorInfo_NpcActionInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readLong(fields, 10)
        );
    }
}
