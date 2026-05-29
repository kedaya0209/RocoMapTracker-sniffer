// Generated from scene_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneStaminaChangeNotify(
    int changeReason,
    int staminaChange,
    boolean banStamina
) {
    public static ZoneSceneStaminaChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneStaminaChangeNotify(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneSceneStaminaChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneStaminaChangeNotify(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
