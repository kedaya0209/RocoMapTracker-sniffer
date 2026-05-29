// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomePetInfo(
    int petGid,
    int petCfgId,
    long furnitureGuid,
    HomePetFeedInfo feedInfo,
    HomePetAwardInfo awardsInfo,
    int status,
    int specialityId,
    List<Integer> realSpecialityIds,
    byte[] name,
    int feedRound,
    Position pos
) {
    public static HomePetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.HomePetFeedInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.HomePetAwardInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readBytes(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
    public static HomePetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomePetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.HomePetFeedInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.HomePetAwardInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readIntList(fields, 10),
            Pojos.readBytes(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
}
