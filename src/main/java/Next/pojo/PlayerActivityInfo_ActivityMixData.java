// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityMixData(
    int faction,
    long refreshTime,
    long nextRefreshTime,
    int mainTaskId,
    List<Integer> optionalTaskId,
    int remainRefreshTimes,
    List<NpcChallengeItem> npcChallengeItems,
    boolean initFaction,
    List<FinishFactionItem> finishedFaction,
    boolean canChooseNewFaction,
    boolean experienceCardPopup,
    boolean allFinish,
    List<Integer> finishTaskId,
    boolean factionRankSettled,
    int firstChooseFaction
) {
    public static PlayerActivityInfo_ActivityMixData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityMixData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.NpcChallengeItem::parseFrom).toList(),
            Pojos.readBool(fields, 8),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.FinishFactionItem::parseFrom).toList(),
            Pojos.readBool(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readIntList(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15, 0)
        );
    }
    public static PlayerActivityInfo_ActivityMixData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityMixData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readIntList(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readMessageList(fields, 7).stream().map(Next.pojo.NpcChallengeItem::parseFrom).toList(),
            Pojos.readBool(fields, 8),
            Pojos.readMessageList(fields, 9).stream().map(Next.pojo.FinishFactionItem::parseFrom).toList(),
            Pojos.readBool(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readIntList(fields, 13),
            Pojos.readBool(fields, 14),
            Pojos.readInt(fields, 15, 0)
        );
    }
}
