// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSetPlayerCardCollectPetInfoReq(
    int cardModuleId,
    List<PlayerCardBriefInfo_CollectPetInfo> collectPetInfo
) {
    public static ZoneSetPlayerCardCollectPetInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetPlayerCardCollectPetInfoReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerCardBriefInfo_CollectPetInfo::parseFrom).toList()
        );
    }
    public static ZoneSetPlayerCardCollectPetInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetPlayerCardCollectPetInfoReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerCardBriefInfo_CollectPetInfo::parseFrom).toList()
        );
    }
}
