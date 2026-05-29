// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneRefreshMixActivityTaskRsp(
    RetInfo retInfo,
    PlayerActivityInfo_ActivityData activityData
) {
    public static ZoneRefreshMixActivityTaskRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRefreshMixActivityTaskRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneRefreshMixActivityTaskRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRefreshMixActivityTaskRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
