// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClientStartUpReq(
    int cliStartupChannel
) {
    public static ZoneClientStartUpReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientStartUpReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneClientStartUpReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientStartUpReq(
            Pojos.readInt(fields, 1)
        );
    }
}
