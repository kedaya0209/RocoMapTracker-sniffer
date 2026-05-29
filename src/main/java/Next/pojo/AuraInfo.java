// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AuraInfo(
    long id,
    int auraConfId,
    Position pos,
    long belongActorId,
    boolean isAvatarInAura,
    long timeOutTime,
    long tickTimeOutTime,
    long createActorId,
    boolean enabled,
    int dir,
    long createTime,
    List<Integer> params,
    int radius,
    long belongLogicId,
    long createLogicId,
    long createGameTime,
    long createAvatarId,
    boolean fromBattle,
    int createSceneCfgId,
    ShareAuraInfo shareInfo,
    boolean isBornCreate
) {
    public static AuraInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AuraInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readLong(fields, 14),
            Pojos.readLong(fields, 15),
            Pojos.readLong(fields, 16),
            Pojos.readLong(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readMessage(fields, 20) != null ? Next.pojo.ShareAuraInfo.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readBool(fields, 21)
        );
    }
    public static AuraInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AuraInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readBool(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readLong(fields, 14),
            Pojos.readLong(fields, 15),
            Pojos.readLong(fields, 16),
            Pojos.readLong(fields, 17),
            Pojos.readBool(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readMessage(fields, 20) != null ? Next.pojo.ShareAuraInfo.parseFrom(Pojos.readMessage(fields, 20)) : null,
            Pojos.readBool(fields, 21)
        );
    }
}
