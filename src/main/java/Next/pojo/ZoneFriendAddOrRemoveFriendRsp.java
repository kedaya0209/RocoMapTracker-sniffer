// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFriendAddOrRemoveFriendRsp(
    RetInfo retInfo,
    int type,
    BanInfo banInfo
) {
    public static ZoneFriendAddOrRemoveFriendRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendAddOrRemoveFriendRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneFriendAddOrRemoveFriendRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendAddOrRemoveFriendRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
