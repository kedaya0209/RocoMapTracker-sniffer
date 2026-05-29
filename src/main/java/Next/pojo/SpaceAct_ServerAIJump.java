// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_ServerAIJump(
    long actorId,
    Position jumpPos,
    long maxHeight,
    long curTime,
    SvrAISyncCommonInfo syncCommonInfo,
    Position beginPos
) {
    public static SpaceAct_ServerAIJump parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ServerAIJump(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static SpaceAct_ServerAIJump parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ServerAIJump(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
