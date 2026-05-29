// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHandbookChangeNotify_AreaHandbookChangeInfo(
    int hbAreaType,
    int currFoundCollNum,
    int currCollectCollNum
) {
    public static ZoneHandbookChangeNotify_AreaHandbookChangeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHandbookChangeNotify_AreaHandbookChangeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneHandbookChangeNotify_AreaHandbookChangeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHandbookChangeNotify_AreaHandbookChangeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
