// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSelectTeamBattleFlowerSeedBossReq(
    int uin,
    long npcLogicId
) {
    public static ZoneSelectTeamBattleFlowerSeedBossReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSelectTeamBattleFlowerSeedBossReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneSelectTeamBattleFlowerSeedBossReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSelectTeamBattleFlowerSeedBossReq(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
