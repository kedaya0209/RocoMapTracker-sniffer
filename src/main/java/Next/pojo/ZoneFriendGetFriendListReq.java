// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFriendGetFriendListReq(
    int count,
    int friendType,
    List<Integer> groups,
    int scene,
    List<Integer> uinList,
    int furnitureId,
    int clientData1,
    int clientData2,
    int clientData3,
    int clientData4
) {
    public static ZoneFriendGetFriendListReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendGetFriendListReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 10),
            Pojos.readInt(fields, 11, 0),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17)
        );
    }
    public static ZoneFriendGetFriendListReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendGetFriendListReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 10),
            Pojos.readInt(fields, 11, 0),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17)
        );
    }
}
