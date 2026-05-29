// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetPlayerActivityHistoryDataRsp(
    RetInfo retInfo,
    List<PlayerActivityInfo_ActivityData> activityData
) {
    public static ZoneGetPlayerActivityHistoryDataRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPlayerActivityHistoryDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityData::parseFrom).toList()
        );
    }
    public static ZoneGetPlayerActivityHistoryDataRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPlayerActivityHistoryDataRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityData::parseFrom).toList()
        );
    }
}
