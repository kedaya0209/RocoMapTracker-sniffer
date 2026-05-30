// Generated from com_handbook.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HandbookRecord(
    int petBaseId,
    boolean isBoss,
    int heightMin,
    int heightMax,
    int weightMin,
    int weightMax,
    int catchThresAdd,
    int addTime,
    int status,
    List<Integer> caughtCamp,
    int mutationType,
    boolean hadNormalForm,
    List<Integer> otherBossBaseIds,
    List<HandbookStatistics> statistics,
    List<GlassInfo> glassInfos,
    List<GlassInfo> shineGlassInfos,
    List<BossRecordStatus> bossStatus,
    int formGroup,
    List<Integer> catchMutation
) {
    public static HandbookRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HandbookRecord(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 16),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 15),
            Pojos.readIntList(fields, 18),
            Pojos.readMessageList(fields, 19).stream().map(Next.pojo.HandbookStatistics::parseFrom).toList(),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.GlassInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 21).stream().map(Next.pojo.GlassInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 22).stream().map(Next.pojo.BossRecordStatus::parseFrom).toList(),
            Pojos.readInt(fields, 23),
            Pojos.readIntList(fields, 24)
        );
    }
    public static HandbookRecord parseFrom(java.util.List<ProtoField> fields) {
        return new HandbookRecord(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 16),
            Pojos.readIntList(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 15),
            Pojos.readIntList(fields, 18),
            Pojos.readMessageList(fields, 19).stream().map(Next.pojo.HandbookStatistics::parseFrom).toList(),
            Pojos.readMessageList(fields, 20).stream().map(Next.pojo.GlassInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 21).stream().map(Next.pojo.GlassInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 22).stream().map(Next.pojo.BossRecordStatus::parseFrom).toList(),
            Pojos.readInt(fields, 23),
            Pojos.readIntList(fields, 24)
        );
    }
}
