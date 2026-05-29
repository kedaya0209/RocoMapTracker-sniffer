// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetBoxMarkTypeUnlockNty(
    int markType
) {
    public static ZonePetBoxMarkTypeUnlockNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBoxMarkTypeUnlockNty(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZonePetBoxMarkTypeUnlockNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBoxMarkTypeUnlockNty(
            Pojos.readInt(fields, 1)
        );
    }
}
