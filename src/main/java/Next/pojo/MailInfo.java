// Generated from mail_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MailInfo(
    long mailGid,
    MailSrc src,
    byte[] title,
    byte[] contents,
    int addTime,
    int expireTime,
    int recvStatus,
    int mailStatus,
    int mailConfId,
    MailParamList params,
    GoodsReward reward,
    boolean useSvrData,
    int platType,
    int condType,
    int rewardId,
    int guardId,
    long mailSerialNum
) {
    public static MailInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MailInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MailSrc.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8, 0),
            Pojos.readInt(fields, 9, 0),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.MailParamList.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readLong(fields, 18)
        );
    }
    public static MailInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MailInfo(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MailSrc.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8, 0),
            Pojos.readInt(fields, 9, 0),
            Pojos.readInt(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.MailParamList.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readBool(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readLong(fields, 18)
        );
    }
}
