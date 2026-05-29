// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record B1FinalBattleInfo(
    int b1PhantomPoint,
    boolean p3UltiSkill,
    int p1EnemyPetNum
) {
    public static B1FinalBattleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new B1FinalBattleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static B1FinalBattleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new B1FinalBattleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
