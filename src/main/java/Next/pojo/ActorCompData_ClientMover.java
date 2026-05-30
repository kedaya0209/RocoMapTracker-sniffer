// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_ClientMover(
    long platformActorId
) {
    public static ActorCompData_ClientMover parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_ClientMover(
            Pojos.readLong(fields, 6)
        );
    }
    public static ActorCompData_ClientMover parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_ClientMover(
            Pojos.readLong(fields, 6)
        );
    }
}
