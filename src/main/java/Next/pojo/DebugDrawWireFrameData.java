// Generated from scene_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DebugDrawWireFrameData(
    List<DebugDrawWireFrame> lines,
    DebugDrawColor color,
    float showTime,
    int thickness,
    int arrowSize
) {
    public static DebugDrawWireFrameData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DebugDrawWireFrameData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DebugDrawWireFrame::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readFloat(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static DebugDrawWireFrameData parseFrom(java.util.List<ProtoField> fields) {
        return new DebugDrawWireFrameData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DebugDrawWireFrame::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.DebugDrawColor.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readFloat(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
