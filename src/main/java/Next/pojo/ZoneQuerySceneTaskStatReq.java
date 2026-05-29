// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQuerySceneTaskStatReq(
    int uin
) {
    public static ZoneQuerySceneTaskStatReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQuerySceneTaskStatReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneQuerySceneTaskStatReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQuerySceneTaskStatReq(
            Pojos.readInt(fields, 1)
        );
    }
}
