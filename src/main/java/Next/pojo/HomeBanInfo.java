// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomeBanInfo(
    boolean isBanned,
    int beginTime,
    int endTime,
    byte[] banReason
) {
    public static HomeBanInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeBanInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4)
        );
    }
    public static HomeBanInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeBanInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4)
        );
    }
}
