// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerRideStatusParams(
    int ridePetId,
    int mutationType,
    int relativeEmotion,
    int activeSkill,
    int rideMoveMode,
    int rideBasicMoveId,
    int ridePetGid,
    long doubleRide1pId,
    long doubleRide2pId,
    int rideSocketType,
    boolean rideLoadFinish,
    int unrideFlag,
    GlassInfo glassInfo,
    long rideNpcId,
    long ownerId,
    int petVoice,
    int petGid
) {
    public static PlayerRideStatusParams parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerRideStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 11),
            Pojos.readLong(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readLong(fields, 17),
            Pojos.readLong(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20)
        );
    }
    public static PlayerRideStatusParams parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerRideStatusParams(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 11),
            Pojos.readLong(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readLong(fields, 17),
            Pojos.readLong(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20)
        );
    }
}
