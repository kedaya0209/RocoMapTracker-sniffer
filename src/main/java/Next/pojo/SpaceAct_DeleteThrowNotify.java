// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_DeleteThrowNotify(
    long casterId,
    int throwId,
    long npcId,
    boolean isCatchSuccess,
    int shakeTimes,
    boolean isTechSatisfied,
    boolean isCatch,
    GlassInfo glassInfo,
    boolean isQuickCatch,
    boolean isCreatePetNpc
) {
    public static SpaceAct_DeleteThrowNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_DeleteThrowNotify(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readBool(fields, 9),
            Pojos.readBool(fields, 10)
        );
    }
    public static SpaceAct_DeleteThrowNotify parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_DeleteThrowNotify(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readMessage(fields, 8) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readBool(fields, 9),
            Pojos.readBool(fields, 10)
        );
    }
}
