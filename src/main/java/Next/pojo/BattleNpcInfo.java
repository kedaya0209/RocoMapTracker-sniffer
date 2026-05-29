// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleNpcInfo(
    long npcObjId,
    long lastCatchTime,
    int catchGuaranteeRate,
    List<BattleBuffBrefInfo> buffInfo,
    int belongCamp,
    long createrUin,
    boolean isContinousCatchBonus,
    List<Long> createVisitingUins
) {
    public static BattleNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readLongList(fields, 8)
        );
    }
    public static BattleNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleNpcInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5),
            Pojos.readLong(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readLongList(fields, 8)
        );
    }
}
