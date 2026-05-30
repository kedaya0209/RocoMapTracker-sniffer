// Generated from com_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ThrowSeatInfoOne(
    int npcCfgId,
    long npcId,
    boolean isCallOut
) {
    public static ThrowSeatInfoOne parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowSeatInfoOne(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ThrowSeatInfoOne parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowSeatInfoOne(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
