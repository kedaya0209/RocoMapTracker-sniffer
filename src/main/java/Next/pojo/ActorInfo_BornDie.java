// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_BornDie(
    String skillOrAnim,
    boolean isSkill,
    long startPlayTime,
    boolean isBorning,
    boolean isDying,
    int dieReason,
    int bornReason,
    long createActorId
) {
    public static ActorInfo_BornDie parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_BornDie(
            Pojos.readString(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8)
        );
    }
    public static ActorInfo_BornDie parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_BornDie(
            Pojos.readString(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8)
        );
    }
}
