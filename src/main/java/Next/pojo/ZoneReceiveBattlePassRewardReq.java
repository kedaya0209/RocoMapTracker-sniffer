// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReceiveBattlePassRewardReq(
    boolean receiveAllReward,
    int index
) {
    public static ZoneReceiveBattlePassRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceiveBattlePassRewardReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneReceiveBattlePassRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceiveBattlePassRewardReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
