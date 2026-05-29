// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFriendBatchSearchPlayerRsp(
    RetInfo retInfo,
    List<ZoneSearchPlayerResult> roleList,
    BanInfo banInfo
) {
    public static ZoneFriendBatchSearchPlayerRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendBatchSearchPlayerRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneSearchPlayerResult::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneFriendBatchSearchPlayerRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendBatchSearchPlayerRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneSearchPlayerResult::parseFrom).toList(),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BanInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
