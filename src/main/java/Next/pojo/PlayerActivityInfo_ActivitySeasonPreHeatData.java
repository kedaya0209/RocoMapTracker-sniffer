// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivitySeasonPreHeatData(
    int activitySubId,
    int finalRewardStatus,
    List<SeasonPreHeat_Section> sectionList
) {
    public static PlayerActivityInfo_ActivitySeasonPreHeatData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivitySeasonPreHeatData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SeasonPreHeat_Section::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivitySeasonPreHeatData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivitySeasonPreHeatData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SeasonPreHeat_Section::parseFrom).toList()
        );
    }
}
