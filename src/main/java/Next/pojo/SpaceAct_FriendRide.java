// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_FriendRide(
    List<FriendRideData> friendRideDataList,
    boolean isRiding,
    List<SpaceAct_FriendRide_FriendRideInfo> friendRideInfoList
) {
    public static SpaceAct_FriendRide parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_FriendRide(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FriendRideData::parseFrom).toList(),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SpaceAct_FriendRide_FriendRideInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_FriendRide parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_FriendRide(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FriendRideData::parseFrom).toList(),
            Pojos.readBool(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SpaceAct_FriendRide_FriendRideInfo::parseFrom).toList()
        );
    }
}
