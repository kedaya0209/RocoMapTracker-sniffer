// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerStarLightInfo(
    int currentProgress,
    int unexchangeWishingStarNum,
    int currentEfficiency,
    int todayStarLightNum,
    boolean needNotifyRefresh
) {
    public static PlayerStarLightInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerStarLightInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
    public static PlayerStarLightInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerStarLightInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
}
