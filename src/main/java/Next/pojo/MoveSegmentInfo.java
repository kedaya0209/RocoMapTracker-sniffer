// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MoveSegmentInfo(
    Position pos,
    long timeStamp
) {
    public static MoveSegmentInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MoveSegmentInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2)
        );
    }
    public static MoveSegmentInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MoveSegmentInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2)
        );
    }
}
