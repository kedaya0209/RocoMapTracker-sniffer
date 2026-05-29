// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneScenePlayerActNtyReq(
    int playerAct,
    int playerSubAct
) {
    public static ZoneScenePlayerActNtyReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePlayerActNtyReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneScenePlayerActNtyReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePlayerActNtyReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
