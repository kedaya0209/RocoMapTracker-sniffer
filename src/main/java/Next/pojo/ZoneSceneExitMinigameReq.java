// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneExitMinigameReq(
    int minigameCfgId
) {
    public static ZoneSceneExitMinigameReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneExitMinigameReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneExitMinigameReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneExitMinigameReq(
            Pojos.readInt(fields, 1)
        );
    }
}
