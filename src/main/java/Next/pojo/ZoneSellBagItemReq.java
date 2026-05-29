// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSellBagItemReq(
    int gid,
    int num,
    int type,
    List<BagSellNode> gidList
) {
    public static ZoneSellBagItemReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSellBagItemReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BagSellNode::parseFrom).toList()
        );
    }
    public static ZoneSellBagItemReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSellBagItemReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.BagSellNode::parseFrom).toList()
        );
    }
}
