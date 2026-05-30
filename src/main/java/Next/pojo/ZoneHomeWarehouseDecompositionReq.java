// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneHomeWarehouseDecompositionReq(
    List<ZoneHomeWarehouseDecompositionReq_FurnitureInfo> targetList
) {
    public static ZoneHomeWarehouseDecompositionReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeWarehouseDecompositionReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneHomeWarehouseDecompositionReq_FurnitureInfo::parseFrom).toList()
        );
    }
    public static ZoneHomeWarehouseDecompositionReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeWarehouseDecompositionReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneHomeWarehouseDecompositionReq_FurnitureInfo::parseFrom).toList()
        );
    }
}
