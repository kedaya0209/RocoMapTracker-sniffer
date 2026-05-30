// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
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
