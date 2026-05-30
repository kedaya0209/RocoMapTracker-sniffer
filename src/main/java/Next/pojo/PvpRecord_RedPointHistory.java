// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PvpRecord_RedPointHistory(
    int weekWinCount,
    int pvpRankStar
) {
    public static PvpRecord_RedPointHistory parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PvpRecord_RedPointHistory(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PvpRecord_RedPointHistory parseFrom(java.util.List<ProtoField> fields) {
        return new PvpRecord_RedPointHistory(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
