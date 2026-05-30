// Generated from com_battle.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TerritoryTrialPetInfo(
    int defeatPoint,
    List<Integer> guardEntrys,
    boolean isBoss
) {
    public static TerritoryTrialPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TerritoryTrialPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static TerritoryTrialPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TerritoryTrialPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
