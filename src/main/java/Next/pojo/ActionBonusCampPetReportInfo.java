// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActionBonusCampPetReportInfo(
    List<ActionBonusCampPetReportData> reportData,
    List<Integer> reportFinishIds,
    List<Integer> reportWaitIds
) {
    public static ActionBonusCampPetReportInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActionBonusCampPetReportInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActionBonusCampPetReportData::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static ActionBonusCampPetReportInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActionBonusCampPetReportInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActionBonusCampPetReportData::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
