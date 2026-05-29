// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmBatchGetPlayerBriefInfoRsp(
    RetInfo retInfo,
    List<PlayerBriefInfo> briefList
) {
    public static ZoneGmBatchGetPlayerBriefInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmBatchGetPlayerBriefInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerBriefInfo::parseFrom).toList()
        );
    }
    public static ZoneGmBatchGetPlayerBriefInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmBatchGetPlayerBriefInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerBriefInfo::parseFrom).toList()
        );
    }
}
