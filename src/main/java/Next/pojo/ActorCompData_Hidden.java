// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_Hidden(
    long lastRevealTime
) {
    public static ActorCompData_Hidden parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Hidden(
            Pojos.readLong(fields, 1)
        );
    }
    public static ActorCompData_Hidden parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Hidden(
            Pojos.readLong(fields, 1)
        );
    }
}
