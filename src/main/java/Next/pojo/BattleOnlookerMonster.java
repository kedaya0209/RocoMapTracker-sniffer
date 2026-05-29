// Generated from com_battle.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleOnlookerMonster(
    int baseConfId,
    int nature,
    int mutationType,
    GlassInfo glassInfo
) {
    public static BattleOnlookerMonster parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleOnlookerMonster(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static BattleOnlookerMonster parseFrom(java.util.List<ProtoField> fields) {
        return new BattleOnlookerMonster(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
