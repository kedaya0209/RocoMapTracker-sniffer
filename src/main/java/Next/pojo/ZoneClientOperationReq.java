// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClientOperationReq(
    ClientOperation operation
) {
    public static ZoneClientOperationReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientOperationReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ClientOperation.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneClientOperationReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientOperationReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ClientOperation.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
