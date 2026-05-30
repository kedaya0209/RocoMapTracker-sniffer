// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomeWarehouseDecompositionReq_FurnitureInfo(
    int gid,
    int num
) {
    public static ZoneHomeWarehouseDecompositionReq_FurnitureInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeWarehouseDecompositionReq_FurnitureInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneHomeWarehouseDecompositionReq_FurnitureInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeWarehouseDecompositionReq_FurnitureInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
