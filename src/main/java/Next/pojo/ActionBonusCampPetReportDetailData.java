// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActionBonusCampPetReportDetailData(
    int reportId,
    int reportTimes
) {
    public static ActionBonusCampPetReportDetailData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActionBonusCampPetReportDetailData(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ActionBonusCampPetReportDetailData parseFrom(java.util.List<ProtoField> fields) {
        return new ActionBonusCampPetReportDetailData(
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
