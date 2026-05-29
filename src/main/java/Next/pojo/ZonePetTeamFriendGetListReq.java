// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePetTeamFriendGetListReq(
    int teamType,
    int pageNum,
    String filter
) {
    public static ZonePetTeamFriendGetListReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetTeamFriendGetListReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
    public static ZonePetTeamFriendGetListReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetTeamFriendGetListReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3)
        );
    }
}
