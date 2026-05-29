// Generated from scene_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBossChallengeFailNotify(
    int teleportReason
) {
    public static ZoneSceneBossChallengeFailNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBossChallengeFailNotify(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneBossChallengeFailNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBossChallengeFailNotify(
            Pojos.readInt(fields, 1)
        );
    }
}
