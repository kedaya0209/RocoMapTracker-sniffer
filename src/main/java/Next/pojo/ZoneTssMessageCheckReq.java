// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTssMessageCheckReq(
    byte[] message,
    int messageType
) {
    public static ZoneTssMessageCheckReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTssMessageCheckReq(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneTssMessageCheckReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTssMessageCheckReq(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
