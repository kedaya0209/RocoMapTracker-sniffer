// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerInteractStatusParams(
    int interactId,
    int playerUin1,
    int playerUin2,
    long petId,
    int petEggId,
    Point inviterPos,
    Point acceptPos,
    Point petPos,
    int petEggGid,
    int petGid
) {
    public static PlayerInteractStatusParams parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerInteractStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
    public static PlayerInteractStatusParams parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerInteractStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
}
