// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSetPlayerCardCollectPetInfoRsp(
    RetInfo retInfo,
    PlayerCardBriefInfo cardBriefInfo
) {
    public static ZoneSetPlayerCardCollectPetInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetPlayerCardCollectPetInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneSetPlayerCardCollectPetInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetPlayerCardCollectPetInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerCardBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
