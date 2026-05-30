// Generated from com_player_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerCoreAdditionalBriefInfo(
    PlayerBriefSecInfo briefSecInfo
) {
    public static PlayerCoreAdditionalBriefInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCoreAdditionalBriefInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerBriefSecInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static PlayerCoreAdditionalBriefInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCoreAdditionalBriefInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerBriefSecInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
