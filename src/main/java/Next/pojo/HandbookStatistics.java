// Generated from com_handbook.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HandbookStatistics(
    int teamType,
    List<HandbookStatistics_StatInfo> topSixNature,
    List<HandbookStatistics_StatInfo> topSixTalent,
    List<HandbookStatistics_StatInfo> topSixBlood,
    List<HandbookStatistics_StatInfo> topSixSkill,
    HandbookStatistics_TopStatInfo topNature,
    HandbookStatistics_TopStatInfo topTalent,
    HandbookStatistics_TopStatInfo topBlood,
    HandbookStatistics_TopStatInfo topSkill
) {
    public static HandbookStatistics parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HandbookStatistics(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HandbookStatistics_StatInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HandbookStatistics_StatInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.HandbookStatistics_StatInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.HandbookStatistics_StatInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.HandbookStatistics_TopStatInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.HandbookStatistics_TopStatInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.HandbookStatistics_TopStatInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.HandbookStatistics_TopStatInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
    public static HandbookStatistics parseFrom(java.util.List<ProtoField> fields) {
        return new HandbookStatistics(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.HandbookStatistics_StatInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.HandbookStatistics_StatInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.HandbookStatistics_StatInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.HandbookStatistics_StatInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.HandbookStatistics_TopStatInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.HandbookStatistics_TopStatInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.HandbookStatistics_TopStatInfo.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 9) != null ? Next.pojo.HandbookStatistics_TopStatInfo.parseFrom(Pojos.readMessage(fields, 9)) : null
        );
    }
}
