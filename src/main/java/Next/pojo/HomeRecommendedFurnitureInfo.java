// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeRecommendedFurnitureInfo(
    List<Integer> recommendedIdList,
    long nextUpdateTimestamp
) {
    public static HomeRecommendedFurnitureInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeRecommendedFurnitureInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static HomeRecommendedFurnitureInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeRecommendedFurnitureInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
