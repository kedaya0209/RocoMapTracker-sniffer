// Generated from com_scene_ai.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneAiReportInfo(
    long npcObjId,
    int reportType,
    int aiSeqId,
    Point clientPoint,
    long attackObjId,
    int dialogId
) {
    public static SceneAiReportInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneAiReportInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
    public static SceneAiReportInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SceneAiReportInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11)
        );
    }
}
