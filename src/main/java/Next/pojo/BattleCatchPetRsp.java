// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleCatchPetRsp(
    boolean isCaught,
    int catchProbability
) {
    public static BattleCatchPetRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleCatchPetRsp(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BattleCatchPetRsp parseFrom(java.util.List<ProtoField> fields) {
        return new BattleCatchPetRsp(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
