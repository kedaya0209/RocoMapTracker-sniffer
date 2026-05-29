// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneScenePickEggResultNotify(
    int uin,
    int result
) {
    public static ZoneScenePickEggResultNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePickEggResultNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneScenePickEggResultNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePickEggResultNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
