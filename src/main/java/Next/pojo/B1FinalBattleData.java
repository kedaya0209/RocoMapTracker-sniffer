// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record B1FinalBattleData(
    boolean switchToP2,
    int P2BattleCfgId,
    boolean switchToP3,
    int P3BattleCfgId,
    int b1PhantomPoint,
    boolean p3UltiSkill,
    int p1EnemyPetNum
) {
    public static B1FinalBattleData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new B1FinalBattleData(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
    public static B1FinalBattleData parseFrom(java.util.List<ProtoField> fields) {
        return new B1FinalBattleData(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readInt(fields, 7)
        );
    }
}
