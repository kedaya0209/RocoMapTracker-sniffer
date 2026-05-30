// Generated from friend_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FriendRoleHomeExtInfo(
    boolean homePetCanSteal,
    boolean homePlantCanPick,
    int searchRet
) {
    public static FriendRoleHomeExtInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FriendRoleHomeExtInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static FriendRoleHomeExtInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FriendRoleHomeExtInfo(
            Pojos.readBool(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
