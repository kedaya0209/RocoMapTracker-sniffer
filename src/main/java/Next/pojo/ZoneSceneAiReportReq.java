// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneAiReportReq(
    long npcObjId,
    int reportType,
    int aiSeqId,
    Point clientPoint,
    long attackObjId,
    int dialogId,
    List<SceneAiReportInfo> reportList
) {
    public static ZoneSceneAiReportReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneAiReportReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.SceneAiReportInfo::parseFrom).toList()
        );
    }
    public static ZoneSceneAiReportReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneAiReportReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readLong(fields, 10),
            Pojos.readInt(fields, 11),
            Pojos.readMessageList(fields, 12).stream().map(Next.pojo.SceneAiReportInfo::parseFrom).toList()
        );
    }
}
