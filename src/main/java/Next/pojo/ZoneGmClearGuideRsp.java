// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmClearGuideRsp(
    RetInfo retInfo,
    GuideGroup syncGroup
) {
    public static ZoneGmClearGuideRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmClearGuideRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GuideGroup.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGmClearGuideRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmClearGuideRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.GuideGroup.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
