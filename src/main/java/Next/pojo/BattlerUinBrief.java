// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattlerUinBrief(
    int mateNum,
    int mateHumanNum,
    int mateFriNum,
    int enemyNum,
    int enemyHumanNum,
    int enemyFriNum,
    List<Integer> mateUins,
    List<Integer> enemyUins,
    int hisObserverNum
) {
    public static BattlerUinBrief parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlerUinBrief(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
    public static BattlerUinBrief parseFrom(java.util.List<ProtoField> fields) {
        return new BattlerUinBrief(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readIntList(fields, 7),
            Pojos.readIntList(fields, 8),
            Pojos.readInt(fields, 9)
        );
    }
}
