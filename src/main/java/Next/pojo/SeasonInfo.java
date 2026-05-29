// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SeasonInfo(
    int seasonId,
    int seasonKvType,
    int popupTime,
    List<BossBattleRuleInfo> bossBattleRuleInfos,
    List<SeasonPlayerGrowth> lightGrowths,
    int seasonPveId,
    List<SeasonPartData> seasonPartDatas,
    int seasonPvTime,
    int seasonPopWindowsTime
) {
    public static SeasonInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SeasonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BossBattleRuleInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.SeasonPlayerGrowth::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.SeasonPartData::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static SeasonInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SeasonInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BossBattleRuleInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.SeasonPlayerGrowth::parseFrom).toList(),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.SeasonPartData::parseFrom).toList(),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
