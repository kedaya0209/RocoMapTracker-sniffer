// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQueryDownloadRewardsRsp_RewardItem(
    int id,
    int num,
    int type
) {
    public static ZoneQueryDownloadRewardsRsp_RewardItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryDownloadRewardsRsp_RewardItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static ZoneQueryDownloadRewardsRsp_RewardItem parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryDownloadRewardsRsp_RewardItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
