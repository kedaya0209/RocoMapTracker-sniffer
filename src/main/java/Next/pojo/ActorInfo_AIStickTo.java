// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_AIStickTo(
    long targetActorId,
    long selfSocket,
    long targetSocket,
    long stickAnim,
    Position rotate,
    Position translate
) {
    public static ActorInfo_AIStickTo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AIStickTo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static ActorInfo_AIStickTo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AIStickTo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
