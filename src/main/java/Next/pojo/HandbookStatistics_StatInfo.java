// Generated from com_handbook.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HandbookStatistics_StatInfo(
    int data,
    int ratio
) {
    public static HandbookStatistics_StatInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HandbookStatistics_StatInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static HandbookStatistics_StatInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HandbookStatistics_StatInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
