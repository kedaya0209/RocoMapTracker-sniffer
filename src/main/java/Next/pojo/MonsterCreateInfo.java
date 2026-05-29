// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MonsterCreateInfo(
    int confId,
    int ballId,
    int successCatchCnt,
    int battlerId,
    int handbookThreshold,
    int handbookProbAdd,
    long lastCatchTime,
    int catchGuaranteeRate,
    long npcObjId,
    CheerMonsterInitInfo cheerInfo,
    List<BattleBuffBrefInfo> buffInfos,
    int belongCamp,
    TerritoryTrialPetInfo trialPetInfo
) {
    public static MonsterCreateInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MonsterCreateInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.CheerMonsterInitInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList(),
            Pojos.readInt(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.TerritoryTrialPetInfo.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
    public static MonsterCreateInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MonsterCreateInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 7),
            Pojos.readLong(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readLong(fields, 10),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.CheerMonsterInitInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessageList(fields, 11).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList(),
            Pojos.readInt(fields, 12),
            Pojos.readMessage(fields, 13) != null ? Next.pojo.TerritoryTrialPetInfo.parseFrom(Pojos.readMessage(fields, 13)) : null
        );
    }
}
