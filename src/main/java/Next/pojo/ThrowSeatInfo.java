// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ThrowSeatInfo(
    List<ThrowSeatInfoOne> seatInfoList
) {
    public static ThrowSeatInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowSeatInfo(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ThrowSeatInfoOne::parseFrom).toList()
        );
    }
    public static ThrowSeatInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowSeatInfo(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ThrowSeatInfoOne::parseFrom).toList()
        );
    }
}
