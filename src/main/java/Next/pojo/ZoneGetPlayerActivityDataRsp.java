// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetPlayerActivityDataRsp(
    RetInfo retInfo,
    PlayerActivityInfo_ActivityData activityData
) {
    public static ZoneGetPlayerActivityDataRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPlayerActivityDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGetPlayerActivityDataRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPlayerActivityDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerActivityInfo_ActivityData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
