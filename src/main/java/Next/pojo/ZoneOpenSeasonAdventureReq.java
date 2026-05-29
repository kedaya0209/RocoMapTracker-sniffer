// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneOpenSeasonAdventureReq(
    int chapterId
) {
    public static ZoneOpenSeasonAdventureReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneOpenSeasonAdventureReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneOpenSeasonAdventureReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneOpenSeasonAdventureReq(
            Pojos.readInt(fields, 1)
        );
    }
}
