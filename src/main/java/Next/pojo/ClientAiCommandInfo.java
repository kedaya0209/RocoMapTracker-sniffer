// Generated from com_scene_ai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClientAiCommandInfo(
    long actorId,
    long actionId,
    Position pos,
    int commandParam
) {
    public static ClientAiCommandInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClientAiCommandInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
    public static ClientAiCommandInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ClientAiCommandInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4)
        );
    }
}
