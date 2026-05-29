// Generated from com_actor.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SelfActorAdjustData(
    long platformActorId
) {
    public static SelfActorAdjustData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SelfActorAdjustData(
            Pojos.readLong(fields, 1)
        );
    }
    public static SelfActorAdjustData parseFrom(java.util.List<ProtoField> fields) {
        return new SelfActorAdjustData(
            Pojos.readLong(fields, 1)
        );
    }
}
