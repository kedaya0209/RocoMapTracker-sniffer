// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleOnlooker(
    int id,
    int npcConfId,
    long npcObjId,
    int pos,
    BattleOnlookerMonster monster
) {
    public static BattleOnlooker parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleOnlooker(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BattleOnlookerMonster.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static BattleOnlooker parseFrom(java.util.List<ProtoField> fields) {
        return new BattleOnlooker(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BattleOnlookerMonster.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
