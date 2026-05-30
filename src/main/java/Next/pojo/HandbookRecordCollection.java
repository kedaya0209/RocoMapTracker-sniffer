// Generated from com_handbook.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HandbookRecordCollection(
    int handbookId,
    List<HandbookRecord> record,
    List<HandbookTopicInfo> topicList,
    int completeNodeNum,
    int totNodeNum,
    List<Boolean> getTopicAward,
    int status,
    int catchProbAdd,
    int catchThresAdd,
    List<HandbookStatistics> statistics
) {
    public static HandbookRecordCollection parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HandbookRecordCollection(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HandbookRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HandbookTopicInfo::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBoolList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.HandbookStatistics::parseFrom).toList()
        );
    }
    public static HandbookRecordCollection parseFrom(java.util.List<ProtoField> fields) {
        return new HandbookRecordCollection(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HandbookRecord::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HandbookTopicInfo::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBoolList(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.HandbookStatistics::parseFrom).toList()
        );
    }
}
