// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneReceiveOwlRefugeRewardReq(
    long npcId,
    int rewardIdx
) {
    public static ZoneSceneReceiveOwlRefugeRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneReceiveOwlRefugeRewardReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneSceneReceiveOwlRefugeRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneReceiveOwlRefugeRewardReq(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
