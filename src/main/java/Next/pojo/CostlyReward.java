// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CostlyReward(
    int rewardId,
    int costlyId
) {
    public static CostlyReward parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CostlyReward(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static CostlyReward parseFrom(java.util.List<ProtoField> fields) {
        return new CostlyReward(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
