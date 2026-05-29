// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneClientRemoteStoreRsp(
    RetInfo retInfo,
    byte[] value,
    long cliStub
) {
    public static ZoneClientRemoteStoreRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneClientRemoteStoreRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ZoneClientRemoteStoreRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneClientRemoteStoreRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBytes(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
