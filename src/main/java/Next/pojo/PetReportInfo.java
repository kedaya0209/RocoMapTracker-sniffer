// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetReportInfo(
    PetBriefInfo petBrief,
    List<ReportInfo> reportInfos,
    long finalRatio,
    long baseCoin,
    long totalCoin
) {
    public static PetReportInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetReportInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ReportInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static PetReportInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetReportInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ReportInfo::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
