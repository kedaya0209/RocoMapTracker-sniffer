// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_NpcDialogSelectInfoChange(
    long npcId,
    int optionId,
    ActorInfo_NpcDialogSelectInfo selectInfo,
    long avatarId
) {
    public static SpaceAct_NpcDialogSelectInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NpcDialogSelectInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_NpcDialogSelectInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4)
        );
    }
    public static SpaceAct_NpcDialogSelectInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NpcDialogSelectInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorInfo_NpcDialogSelectInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4)
        );
    }
}
