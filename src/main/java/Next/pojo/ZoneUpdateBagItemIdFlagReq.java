// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneUpdateBagItemIdFlagReq(
    List<PlayerBagItemIdFlagInfo> bagItemIdFlags
) {
    public static ZoneUpdateBagItemIdFlagReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUpdateBagItemIdFlagReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBagItemIdFlagInfo::parseFrom).toList()
        );
    }
    public static ZoneUpdateBagItemIdFlagReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUpdateBagItemIdFlagReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBagItemIdFlagInfo::parseFrom).toList()
        );
    }
}
