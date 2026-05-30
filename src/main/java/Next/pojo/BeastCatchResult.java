// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BeastCatchResult(
    boolean waitingCatch,
    int startResonanceTime,
    int highSelectStar
) {
    public static BeastCatchResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BeastCatchResult(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static BeastCatchResult parseFrom(java.util.List<ProtoField> fields) {
        return new BeastCatchResult(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
