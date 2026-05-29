// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneLockClientCmdNotify(
    int cmdId,
    int msgIdx
) {
    public static ZoneLockClientCmdNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneLockClientCmdNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneLockClientCmdNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneLockClientCmdNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
