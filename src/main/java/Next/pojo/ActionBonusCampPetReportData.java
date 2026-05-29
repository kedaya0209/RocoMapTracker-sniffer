// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActionBonusCampPetReportData(
    int reportType,
    List<ActionBonusCampPetReportDetailData> reportDetailData
) {
    public static ActionBonusCampPetReportData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActionBonusCampPetReportData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActionBonusCampPetReportDetailData::parseFrom).toList()
        );
    }
    public static ActionBonusCampPetReportData parseFrom(java.util.List<ProtoField> fields) {
        return new ActionBonusCampPetReportData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActionBonusCampPetReportDetailData::parseFrom).toList()
        );
    }
}
