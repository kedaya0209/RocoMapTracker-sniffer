// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record InvitedUser(
    int uin,
    byte[] name,
    int icon,
    int roleLevel,
    int registerTime,
    byte[] platNickName
) {
    public static InvitedUser parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InvitedUser(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6)
        );
    }
    public static InvitedUser parseFrom(java.util.List<ProtoField> fields) {
        return new InvitedUser(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6)
        );
    }
}
