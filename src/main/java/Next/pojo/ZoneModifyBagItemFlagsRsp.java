// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneModifyBagItemFlagsRsp(
    RetInfo retInfo,
    List<BattleItemInfo> items
) {
    public static ZoneModifyBagItemFlagsRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneModifyBagItemFlagsRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleItemInfo::parseFrom).toList()
        );
    }
    public static ZoneModifyBagItemFlagsRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneModifyBagItemFlagsRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleItemInfo::parseFrom).toList()
        );
    }
}
