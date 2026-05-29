// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_AINavMove(
    List<Long> toTimeList,
    List<Position> toPosList,
    int acceptRadius,
    boolean isBackward
) {
    public static ActorInfo_AINavMove parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AINavMove(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static ActorInfo_AINavMove parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AINavMove(
            Pojos.readLongList(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
