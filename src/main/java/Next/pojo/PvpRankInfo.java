// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PvpRankInfo(
    double r,
    long rankStar,
    int rankOrder,
    String rankName,
    int rankSeasonId,
    int rankMasterScore,
    int lastWarmPvpTime,
    int rd,
    double vol
) {
    public static PvpRankInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PvpRankInfo(
            Pojos.readDouble(fields, 101),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readDouble(fields, 9)
        );
    }
    public static PvpRankInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PvpRankInfo(
            Pojos.readDouble(fields, 101),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readString(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readDouble(fields, 9)
        );
    }
}
