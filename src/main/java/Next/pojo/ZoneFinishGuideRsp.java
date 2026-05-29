// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneFinishGuideRsp(
    RetInfo retInfo,
    GuideGroup syncGroup
) {
    public static ZoneFinishGuideRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFinishGuideRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GuideGroup.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneFinishGuideRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFinishGuideRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GuideGroup.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
