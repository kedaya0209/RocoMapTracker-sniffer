// Generated from game_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FrameData(
    int frameId,
    byte[] data
) {
    public static FrameData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FrameData(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
    public static FrameData parseFrom(java.util.List<ProtoField> fields) {
        return new FrameData(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
}
