// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerCatchBallRewardInfo(
    int lastRewardTime,
    int nextRewardTime,
    int catchBallRewardNum,
    boolean enableReward,
    boolean redPointSent
) {
    public static PlayerCatchBallRewardInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCatchBallRewardInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
    public static PlayerCatchBallRewardInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCatchBallRewardInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5)
        );
    }
}
