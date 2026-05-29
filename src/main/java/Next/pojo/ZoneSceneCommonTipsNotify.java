// Generated from scene_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneCommonTipsNotify(
    String localizationId,
    int source
) {
    public static ZoneSceneCommonTipsNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneCommonTipsNotify(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneSceneCommonTipsNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneCommonTipsNotify(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
