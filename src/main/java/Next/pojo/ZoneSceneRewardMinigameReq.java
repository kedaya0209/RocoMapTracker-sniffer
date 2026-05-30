// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRewardMinigameReq(
    int minigameCfgId
) {
    public static ZoneSceneRewardMinigameReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRewardMinigameReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneRewardMinigameReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRewardMinigameReq(
            Pojos.readInt(fields, 1)
        );
    }
}
