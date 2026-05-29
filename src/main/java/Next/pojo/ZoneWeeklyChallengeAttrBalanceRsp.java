// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneWeeklyChallengeAttrBalanceRsp(
    RetInfo retInfo,
    boolean isNeedBalance,
    int balanceLevel,
    int balanceGrow,
    List<PetData> petData,
    List<Integer> monsterConfId,
    List<Integer> monsterLevel,
    int balanceEffort
) {
    public static ZoneWeeklyChallengeAttrBalanceRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneWeeklyChallengeAttrBalanceRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static ZoneWeeklyChallengeAttrBalanceRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneWeeklyChallengeAttrBalanceRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.PetData::parseFrom).toList(),
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
