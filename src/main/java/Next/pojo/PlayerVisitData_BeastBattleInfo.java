// Generated from com_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerVisitData_BeastBattleInfo(
    int beastMatchOwner,
    long beastMatchDstId
) {
    public static PlayerVisitData_BeastBattleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerVisitData_BeastBattleInfo(
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static PlayerVisitData_BeastBattleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerVisitData_BeastBattleInfo(
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
