// Generated from com_handbook.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AreaHandbookInfo(
    int areaHbType,
    int foundCollNum,
    int collectCollNum,
    int hbAwardIdx,
    List<Boolean> awardGetList,
    List<HandbookCoverInfo> areaCovers,
    List<Integer> coverCandidateData,
    List<Integer> topicRp
) {
    public static AreaHandbookInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AreaHandbookInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBoolList(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.HandbookCoverInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 7),
            Pojos.readIntList(fields, 8)
        );
    }
    public static AreaHandbookInfo parseFrom(java.util.List<ProtoField> fields) {
        return new AreaHandbookInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBoolList(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.HandbookCoverInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 7),
            Pojos.readIntList(fields, 8)
        );
    }
}
