// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClientRemoteStoreReq(
    String meth,
    String key,
    byte[] value,
    long liveTime,
    long cliStub
) {
    public static ZoneClientRemoteStoreReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientRemoteStoreReq(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static ZoneClientRemoteStoreReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientRemoteStoreReq(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
