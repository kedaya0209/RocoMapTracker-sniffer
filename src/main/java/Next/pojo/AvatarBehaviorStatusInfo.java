// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AvatarBehaviorStatusInfo(
    int avatarBehaviorStatus,
    int avatarBehaviorSubStatus,
    PlayerStatusCustomParams statusParams
) {
    public static AvatarBehaviorStatusInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AvatarBehaviorStatusInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerStatusCustomParams.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static AvatarBehaviorStatusInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AvatarBehaviorStatusInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerStatusCustomParams.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
