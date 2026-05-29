// Generated from game_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HostInfo(
    byte[] hostIp,
    int hostPort,
    long busId,
    byte[] hostName
) {
    public static HostInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HostInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 5),
            Pojos.readBytes(fields, 6)
        );
    }
    public static HostInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HostInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 5),
            Pojos.readBytes(fields, 6)
        );
    }
}
