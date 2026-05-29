// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record WebGamePlayerInfo(
    long uin,
    byte[] nickName,
    int lastAccessTime,
    int playerLevel,
    int petId,
    int petGetTime,
    int petNature,
    int petLevel,
    int regTime
) {
    public static WebGamePlayerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WebGamePlayerInfo(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static WebGamePlayerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new WebGamePlayerInfo(
            Pojos.readLong(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
