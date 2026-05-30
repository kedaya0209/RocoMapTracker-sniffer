// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_Broadcaster(
    long ringBstLimit,
    long ringBeJoinedBstLimit
) {
    public static ActorCompData_Broadcaster parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Broadcaster(
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ActorCompData_Broadcaster parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Broadcaster(
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
