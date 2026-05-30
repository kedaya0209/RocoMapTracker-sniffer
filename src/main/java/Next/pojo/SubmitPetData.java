// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SubmitPetData(
    int petbaseId,
    int evolutionChainId,
    List<Integer> skillDamTypes,
    List<Integer> bloodId
) {
    public static SubmitPetData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SubmitPetData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
    public static SubmitPetData parseFrom(java.util.List<ProtoField> fields) {
        return new SubmitPetData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
}
