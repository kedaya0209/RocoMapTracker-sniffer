// Generated from friend_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BlackListRoleInfo(
    String openid,
    int uin,
    byte[] name,
    byte[] headImg,
    int level,
    boolean online,
    int gender,
    byte[] signature,
    long blockTime,
    PlayerCardBriefInfo cardInfo,
    int registDate
) {
    public static BlackListRoleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BlackListRoleInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11)
        );
    }
    public static BlackListRoleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BlackListRoleInfo(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBytes(fields, 8),
            Pojos.readLong(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readInt(fields, 11)
        );
    }
}
