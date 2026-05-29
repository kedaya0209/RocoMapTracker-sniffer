// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeGmAddExpReq(
    int exp
) {
    public static ZoneSceneHomeGmAddExpReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeGmAddExpReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneSceneHomeGmAddExpReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeGmAddExpReq(
            Pojos.readInt(fields, 1)
        );
    }
}
