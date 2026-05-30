// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeUnlockedFurnitureIdList(
    List<Integer> idList
) {
    public static HomeUnlockedFurnitureIdList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeUnlockedFurnitureIdList(
            Pojos.readIntList(fields, 1)
        );
    }
    public static HomeUnlockedFurnitureIdList parseFrom(java.util.List<ProtoField> fields) {
        return new HomeUnlockedFurnitureIdList(
            Pojos.readIntList(fields, 1)
        );
    }
}
