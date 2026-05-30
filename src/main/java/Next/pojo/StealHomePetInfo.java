// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record StealHomePetInfo(
    int petGid,
    int feedRound,
    HomePetAwardInfo awardInfo
) {
    public static StealHomePetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new StealHomePetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.HomePetAwardInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static StealHomePetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new StealHomePetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.HomePetAwardInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
