// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneGmOperateStaminaReq(
    int opType
) {
    public static ZoneSceneGmOperateStaminaReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneGmOperateStaminaReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
    public static ZoneSceneGmOperateStaminaReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneGmOperateStaminaReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
}
