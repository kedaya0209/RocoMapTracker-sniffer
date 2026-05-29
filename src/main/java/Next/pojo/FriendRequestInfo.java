// Generated from friend_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FriendRequestInfo(
    String openid,
    int uin,
    byte[] name,
    byte[] headImg,
    int level,
    int worldLevel,
    boolean online,
    int gender,
    byte[] signature,
    long reqTime,
    PlayerCardBriefInfo cardInfo,
    int registDate,
    int source
) {
    public static FriendRequestInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FriendRequestInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBytes(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13, 0)
        );
    }
    public static FriendRequestInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FriendRequestInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readBytes(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13, 0)
        );
    }
}
