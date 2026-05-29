// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneAiReportRsp(
    RetInfo retInfo,
    int aiSeqId
) {
    public static ZoneSceneAiReportRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneAiReportRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSceneAiReportRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneAiReportRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
}
