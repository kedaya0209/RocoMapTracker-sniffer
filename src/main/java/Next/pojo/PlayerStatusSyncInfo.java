// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerStatusSyncInfo(
    int status,
    int opCode,
    int subStatus,
    boolean isNormalRemove,
    PlayerStatusCustomParams customStatusParam,
    PlayerBehaviorStatusExtraParams serverExtraParam
) {
    public static PlayerStatusSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerStatusSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerStatusCustomParams.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerBehaviorStatusExtraParams.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static PlayerStatusSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerStatusSyncInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.PlayerStatusCustomParams.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PlayerBehaviorStatusExtraParams.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
