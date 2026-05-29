// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FactionRankInfo_RankInfo(
    int faction,
    long score
) {
    public static FactionRankInfo_RankInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FactionRankInfo_RankInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2)
        );
    }
    public static FactionRankInfo_RankInfo parseFrom(java.util.List<ProtoField> fields) {
        return new FactionRankInfo_RankInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readLong(fields, 2)
        );
    }
}
