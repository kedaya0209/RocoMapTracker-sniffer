// Generated from com_mail.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MailRecvBrief(
    long mailGid,
    int mailConfId,
    MailParamList params,
    GoodsReward reward,
    byte[] title,
    byte[] contents,
    int rewardId,
    int guardId,
    int addTime,
    long expireAt,
    long mailSerialNum
) {
    public static MailRecvBrief parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MailRecvBrief(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.MailParamList.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBytes(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readLong(fields, 12)
        );
    }
    public static MailRecvBrief parseFrom(java.util.List<ProtoField> fields) {
        return new MailRecvBrief(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.MailParamList.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readBytes(fields, 6),
            Pojos.readBytes(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readLong(fields, 12)
        );
    }
}
