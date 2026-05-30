// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_Aura(
    long id,
    int auraConfId,
    Position pos,
    long belongActorId,
    boolean isAvatarInAura,
    long createActorId,
    boolean enabled,
    int dir,
    List<Integer> params,
    int radius,
    long createAvatarId
) {
    public static ActorInfo_Aura parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Aura(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readIntList(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readLong(fields, 12)
        );
    }
    public static ActorInfo_Aura parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Aura(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readIntList(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readLong(fields, 12)
        );
    }
}
