// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpecBattleDifficultyInfo(
    int battleDifficultyId,
    List<Integer> wonBattleCfgIds
) {
    public static SpecBattleDifficultyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpecBattleDifficultyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static SpecBattleDifficultyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SpecBattleDifficultyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
