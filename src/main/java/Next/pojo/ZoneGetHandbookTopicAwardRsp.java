// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetHandbookTopicAwardRsp(
    RetInfo retInfo,
    int hbId,
    int rewardIdx,
    List<TopicAwardItem> awardItems,
    int topicId
) {
    public static ZoneGetHandbookTopicAwardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetHandbookTopicAwardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.TopicAwardItem::parseFrom).toList(),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneGetHandbookTopicAwardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetHandbookTopicAwardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.TopicAwardItem::parseFrom).toList(),
            Pojos.readInt(fields, 5)
        );
    }
}
