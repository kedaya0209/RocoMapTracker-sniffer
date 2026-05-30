// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_NpcDialogSelectInfo(
    int selectId,
    boolean enabled,
    int remainingTimes,
    int dialogId,
    boolean hasBeenSelected
) {
    public static ActorInfo_NpcDialogSelectInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcDialogSelectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
    public static ActorInfo_NpcDialogSelectInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcDialogSelectInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
}
