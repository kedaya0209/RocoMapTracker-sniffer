// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChangeWardrobeReq(
    int wardrobeIndex
) {
    public static ZoneChangeWardrobeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChangeWardrobeReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneChangeWardrobeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChangeWardrobeReq(
            Pojos.readInt(fields, 1)
        );
    }
}
