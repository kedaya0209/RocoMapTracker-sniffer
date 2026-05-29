// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleUpdateItemReq(
    List<BattleItemInfo> itemList
) {
    public static ZoneBattleUpdateItemReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleUpdateItemReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BattleItemInfo::parseFrom).toList()
        );
    }
    public static ZoneBattleUpdateItemReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleUpdateItemReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BattleItemInfo::parseFrom).toList()
        );
    }
}
