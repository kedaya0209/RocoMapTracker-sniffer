// Generated from com_mail.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TlogPlayerInfo(
    byte[] gameSvrId,
    byte[] eventTime,
    byte[] appId,
    int platId,
    int worldId,
    byte[] openid,
    int uin,
    byte[] roleName,
    int roleLevel
) {
    public static TlogPlayerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TlogPlayerInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static TlogPlayerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TlogPlayerInfo(
            Pojos.readBytes(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
