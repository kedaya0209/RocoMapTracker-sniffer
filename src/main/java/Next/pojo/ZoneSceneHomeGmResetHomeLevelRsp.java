// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeGmResetHomeLevelRsp(
    RetInfo retInfo
) {
    public static ZoneSceneHomeGmResetHomeLevelRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeGmResetHomeLevelRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneSceneHomeGmResetHomeLevelRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeGmResetHomeLevelRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
