// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerVisitData_VisitApplyInfo(
    int applyUin,
    int applyTime
) {
    public static PlayerVisitData_VisitApplyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerVisitData_VisitApplyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerVisitData_VisitApplyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerVisitData_VisitApplyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
