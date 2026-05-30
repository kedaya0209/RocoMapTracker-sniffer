// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_UnlockSleepingOwl(
    long npcId,
    int refugeCfgId
) {
    public static SpaceAct_UnlockSleepingOwl parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_UnlockSleepingOwl(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static SpaceAct_UnlockSleepingOwl parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_UnlockSleepingOwl(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
