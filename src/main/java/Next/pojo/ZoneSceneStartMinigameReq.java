// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneStartMinigameReq(
    int minigameCfgId
) {
    public static ZoneSceneStartMinigameReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneStartMinigameReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneStartMinigameReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneStartMinigameReq(
            Pojos.readInt(fields, 1)
        );
    }
}
