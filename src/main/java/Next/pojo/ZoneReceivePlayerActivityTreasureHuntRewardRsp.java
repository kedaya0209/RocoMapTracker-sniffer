// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReceivePlayerActivityTreasureHuntRewardRsp(
    RetInfo retInfo
) {
    public static ZoneReceivePlayerActivityTreasureHuntRewardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceivePlayerActivityTreasureHuntRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneReceivePlayerActivityTreasureHuntRewardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceivePlayerActivityTreasureHuntRewardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
