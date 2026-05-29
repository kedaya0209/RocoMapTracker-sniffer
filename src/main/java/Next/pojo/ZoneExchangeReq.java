// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneExchangeReq(
    int exchangeId,
    int exchangeNum,
    long npcSpaceObjId,
    List<Integer> costGoodsId,
    CSExchangeItem exchangeItem
) {
    public static ZoneExchangeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneExchangeReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.CSExchangeItem.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static ZoneExchangeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneExchangeReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readIntList(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.CSExchangeItem.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
