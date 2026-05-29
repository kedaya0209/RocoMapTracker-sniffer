// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetSeasonTalentPointRsp(
    RetInfo retInfo,
    int materialCnt,
    List<SeasonPlayerGrowth> lightGrowthList
) {
    public static ZoneGetSeasonTalentPointRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetSeasonTalentPointRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SeasonPlayerGrowth::parseFrom).toList()
        );
    }
    public static ZoneGetSeasonTalentPointRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetSeasonTalentPointRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SeasonPlayerGrowth::parseFrom).toList()
        );
    }
}
