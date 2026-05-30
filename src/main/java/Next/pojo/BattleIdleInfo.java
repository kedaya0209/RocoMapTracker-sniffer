// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleIdleInfo(
    int idlePetId
) {
    public static BattleIdleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleIdleInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static BattleIdleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleIdleInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
