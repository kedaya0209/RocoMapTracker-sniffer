// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_AddNpcOption(
    long npcId,
    ActorInfo_NpcOptionInfo optInfo,
    long avatarId
) {
    public static SpaceAct_AddNpcOption parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_AddNpcOption(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_NpcOptionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3)
        );
    }
    public static SpaceAct_AddNpcOption parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_AddNpcOption(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_NpcOptionInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3)
        );
    }
}
