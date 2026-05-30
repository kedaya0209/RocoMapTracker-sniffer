// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_TerritoryTrialInfo(
    int challengeId,
    int highestScore,
    int leastFinishRound,
    int battleConfId
) {
    public static PlayerActivityInfo_TerritoryTrialInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_TerritoryTrialInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static PlayerActivityInfo_TerritoryTrialInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_TerritoryTrialInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
