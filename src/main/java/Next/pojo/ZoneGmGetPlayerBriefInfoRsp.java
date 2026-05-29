// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGmGetPlayerBriefInfoRsp(
    RetInfo retInfo,
    PlayerBriefInfo briefInfo
) {
    public static ZoneGmGetPlayerBriefInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmGetPlayerBriefInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGmGetPlayerBriefInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmGetPlayerBriefInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
