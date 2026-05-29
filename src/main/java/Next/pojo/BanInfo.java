// Generated from com_rpc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BanInfo(
    int banTime,
    String banReason,
    int uin,
    int banType,
    int funcId
) {
    public static BanInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BanInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static BanInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BanInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
