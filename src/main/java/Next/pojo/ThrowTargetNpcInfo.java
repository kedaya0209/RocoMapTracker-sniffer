// Generated from com_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ThrowTargetNpcInfo(
    long npcId,
    int npcConfId,
    int optionId,
    long npcAiStatus,
    int npcAiBehavior,
    Position npcPos,
    String weaknessPosName,
    String gainExposePosName,
    boolean isBackStab,
    long npcLogicId
) {
    public static ThrowTargetNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowTargetNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readString(fields, 7),
            Pojos.readString(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readLong(fields, 10)
        );
    }
    public static ThrowTargetNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowTargetNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readString(fields, 7),
            Pojos.readString(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readLong(fields, 10)
        );
    }
}
