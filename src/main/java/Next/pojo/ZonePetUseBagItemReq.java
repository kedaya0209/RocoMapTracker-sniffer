// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetUseBagItemReq(
    int petGid,
    List<ZonePetUseBagItemReq_BagItemInfo> bagItemInfo,
    int petTrainType
) {
    public static ZonePetUseBagItemReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetUseBagItemReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZonePetUseBagItemReq_BagItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static ZonePetUseBagItemReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetUseBagItemReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZonePetUseBagItemReq_BagItemInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
