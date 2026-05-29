// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record CellCompData_VisibleCircle(
    List<VisibleCircleData> circles
) {
    public static CellCompData_VisibleCircle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CellCompData_VisibleCircle(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.VisibleCircleData::parseFrom).toList()
        );
    }
    public static CellCompData_VisibleCircle parseFrom(java.util.List<ProtoField> fields) {
        return new CellCompData_VisibleCircle(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.VisibleCircleData::parseFrom).toList()
        );
    }
}
