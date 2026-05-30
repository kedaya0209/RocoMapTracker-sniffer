// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_GameTimeChange(
    long actorId,
    ActorInfo_GameTime gameTimeInfo
) {
    public static SpaceAct_GameTimeChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_GameTimeChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_GameTime.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_GameTimeChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_GameTimeChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_GameTime.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
