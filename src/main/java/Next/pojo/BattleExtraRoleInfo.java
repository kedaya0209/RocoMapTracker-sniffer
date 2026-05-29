// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleExtraRoleInfo(
    BattleOpHistory opHistory,
    int skillResults
) {
    public static BattleExtraRoleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleExtraRoleInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleOpHistory.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
    public static BattleExtraRoleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleExtraRoleInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleOpHistory.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
}
