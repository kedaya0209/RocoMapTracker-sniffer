// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneGmOperateStaminaRsp(
    RetInfo retInfo,
    int stamina,
    int staminaLow,
    int staminaUp,
    int staminaStatus,
    List<Integer> status,
    List<Integer> cost
) {
    public static ZoneSceneGmOperateStaminaRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneGmOperateStaminaRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7)
        );
    }
    public static ZoneSceneGmOperateStaminaRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneGmOperateStaminaRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7)
        );
    }
}
