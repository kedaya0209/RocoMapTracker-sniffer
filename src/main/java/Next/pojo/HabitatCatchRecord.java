// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HabitatCatchRecord(
    int habitatId,
    int accTryCatchTime,
    int accCatchSuccTime,
    int accCatchFailTime,
    int existNpcNum,
    int canRefreshNpcNum,
    long lastTryCatchTime,
    long lastTryTime
) {
    public static HabitatCatchRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HabitatCatchRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8)
        );
    }
    public static HabitatCatchRecord parseFrom(java.util.List<ProtoField> fields) {
        return new HabitatCatchRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readLong(fields, 7),
            Pojos.readLong(fields, 8)
        );
    }
}
