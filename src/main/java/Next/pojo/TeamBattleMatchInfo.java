// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TeamBattleMatchInfo(
    int beastStartMatchTime,
    boolean beastMatching,
    boolean canAutoBeastMatch,
    int foundOwnerUin,
    long matchDstInstId
) {
    public static TeamBattleMatchInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TeamBattleMatchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static TeamBattleMatchInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TeamBattleMatchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
