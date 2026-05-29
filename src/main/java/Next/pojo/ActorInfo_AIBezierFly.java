// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_AIBezierFly(
    int flySpeed,
    List<Position> toPosList,
    List<Long> toTimestampList
) {
    public static ActorInfo_AIBezierFly parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AIBezierFly(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readLongList(fields, 3)
        );
    }
    public static ActorInfo_AIBezierFly parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AIBezierFly(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Position::parseFrom).toList(),
            Pojos.readLongList(fields, 3)
        );
    }
}
