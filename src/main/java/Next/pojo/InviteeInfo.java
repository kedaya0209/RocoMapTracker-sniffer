// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record InviteeInfo(
    int uin,
    int level,
    String platformName,
    String platformOpenid,
    int inviterUin,
    int inviteTs,
    int registerTs,
    List<Integer> partIdClaimedList,
    int lastUpdateTs
) {
    public static InviteeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InviteeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static InviteeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new InviteeInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
