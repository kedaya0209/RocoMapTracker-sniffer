// Generated from com_pet_medal.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record H5PlayerInfo(
    String openid,
    int callback,
    int time,
    int petNature,
    int petLevel
) {
    public static H5PlayerInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new H5PlayerInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static H5PlayerInfo parseFrom(java.util.List<ProtoField> fields) {
        return new H5PlayerInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
