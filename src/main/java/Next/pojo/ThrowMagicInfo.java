// Generated from com_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ThrowMagicInfo(
    int strengthLevel,
    int chargePercentage,
    List<Long> targetAvatarIds,
    ThrowMagicCreateNPCInfo createNpcInfo,
    List<Integer> targetAvatarUins,
    List<Boolean> targetIsFriendList
) {
    public static ThrowMagicInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowMagicInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLongList(fields, 51),
            Pojos.readMessage(fields, 52) != null ? Next.pojo.ThrowMagicCreateNPCInfo.parseFrom(Pojos.readMessage(fields, 52)) : null,
            Pojos.readIntList(fields, 53),
            Pojos.readBoolList(fields, 54)
        );
    }
    public static ThrowMagicInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowMagicInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLongList(fields, 51),
            Pojos.readMessage(fields, 52) != null ? Next.pojo.ThrowMagicCreateNPCInfo.parseFrom(Pojos.readMessage(fields, 52)) : null,
            Pojos.readIntList(fields, 53),
            Pojos.readBoolList(fields, 54)
        );
    }
}
