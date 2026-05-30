// Generated from com_mail.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MailCustomContent(
    int excelId,
    List<Integer> rewardList,
    GoodsReward rewards
) {
    public static MailCustomContent parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MailCustomContent(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static MailCustomContent parseFrom(java.util.List<ProtoField> fields) {
        return new MailCustomContent(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.GoodsReward.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
