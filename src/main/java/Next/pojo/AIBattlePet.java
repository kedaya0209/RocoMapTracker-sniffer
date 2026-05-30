// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AIBattlePet(
    int gid,
    int confId,
    int bloodId,
    List<Integer> equipSkills
) {
    public static AIBattlePet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AIBattlePet(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
    public static AIBattlePet parseFrom(java.util.List<ProtoField> fields) {
        return new AIBattlePet(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
}
