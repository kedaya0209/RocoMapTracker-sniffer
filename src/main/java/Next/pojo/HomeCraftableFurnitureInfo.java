// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeCraftableFurnitureInfo(
    List<Integer> furnitureIdList,
    List<Integer> recommendedIdList,
    long nextUpdateTimestamp
) {
    public static HomeCraftableFurnitureInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeCraftableFurnitureInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readLong(fields, 4)
        );
    }
    public static HomeCraftableFurnitureInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeCraftableFurnitureInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readLong(fields, 4)
        );
    }
}
