// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomeCraftableFurnitureFriendInfo(
    int uin,
    byte[] name,
    int onlineState,
    int logoutTime,
    int cardIconSelected,
    byte[] note,
    int homeLevel,
    boolean isRecommended
) {
    public static HomeCraftableFurnitureFriendInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeCraftableFurnitureFriendInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8)
        );
    }
    public static HomeCraftableFurnitureFriendInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeCraftableFurnitureFriendInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBytes(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 8)
        );
    }
}
