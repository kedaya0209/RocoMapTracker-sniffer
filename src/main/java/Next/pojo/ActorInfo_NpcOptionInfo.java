// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_NpcOptionInfo(
    int optionId,
    boolean enabled,
    int executableTimes,
    List<Integer> storyFlags,
    List<ActorInfo_NpcDialogSelectInfo> selectInfos,
    ActorInfo_NpcActionInfo curActionInfo,
    int succExecTimes,
    int firstDialogId,
    boolean isSharedOpt
) {
    public static ActorInfo_NpcOptionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcOptionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ActorInfo_NpcDialogSelectInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_NpcActionInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
    public static ActorInfo_NpcOptionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcOptionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.ActorInfo_NpcDialogSelectInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.ActorInfo_NpcActionInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBool(fields, 9)
        );
    }
}
