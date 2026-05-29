// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerTeachUnlockNotify(
    int teachId
) {
    public static ZonePlayerTeachUnlockNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerTeachUnlockNotify(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZonePlayerTeachUnlockNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerTeachUnlockNotify(
            Pojos.readInt(fields, 1)
        );
    }
}
