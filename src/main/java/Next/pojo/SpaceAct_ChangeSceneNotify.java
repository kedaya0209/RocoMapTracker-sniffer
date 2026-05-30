// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_ChangeSceneNotify(
    int sceneCfgId,
    ActorInfo selfInfo,
    List<ActorInfo> otherActors
) {
    public static SpaceAct_ChangeSceneNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ChangeSceneNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_ChangeSceneNotify parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ChangeSceneNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorInfo::parseFrom).toList()
        );
    }
}
