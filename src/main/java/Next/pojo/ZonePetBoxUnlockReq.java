// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetBoxUnlockReq(
    int boxId
) {
    public static ZonePetBoxUnlockReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetBoxUnlockReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZonePetBoxUnlockReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetBoxUnlockReq(
            Pojos.readInt(fields, 1)
        );
    }
}
