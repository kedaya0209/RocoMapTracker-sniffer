// Generated from com_handbook.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HandbookStatistics_TopStatInfo(
    List<Integer> topIds,
    List<Integer> topRatios
) {
    public static HandbookStatistics_TopStatInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HandbookStatistics_TopStatInfo(
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7)
        );
    }
    public static HandbookStatistics_TopStatInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HandbookStatistics_TopStatInfo(
            Pojos.readIntList(fields, 6),
            Pojos.readIntList(fields, 7)
        );
    }
}
