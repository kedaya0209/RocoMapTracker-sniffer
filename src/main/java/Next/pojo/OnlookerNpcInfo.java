// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record OnlookerNpcInfo(
    int npcConfId,
    long npcObjId,
    long npcLogicId,
    BattleOnlookerMonster monster
) {
    public static OnlookerNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new OnlookerNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleOnlookerMonster.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static OnlookerNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new OnlookerNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleOnlookerMonster.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
