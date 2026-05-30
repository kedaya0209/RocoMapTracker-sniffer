// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HopeInstruction(
    int type,
    byte[] openid,
    int uin,
    byte[] title,
    byte[] msg,
    byte[] url,
    int modal,
    byte[] ruleName,
    int logoutType,
    byte[] traceId,
    int logoutTime
) {
    public static HopeInstruction parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HopeInstruction(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBytes(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
    public static HopeInstruction parseFrom(java.util.List<ProtoField> fields) {
        return new HopeInstruction(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readBytes(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
}
