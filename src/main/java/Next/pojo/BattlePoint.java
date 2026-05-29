// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattlePoint(
    BattlePosition pos,
    int dir
) {
    public static BattlePoint parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlePoint(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattlePosition.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
    public static BattlePoint parseFrom(java.util.List<ProtoField> fields) {
        return new BattlePoint(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattlePosition.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2)
        );
    }
}
