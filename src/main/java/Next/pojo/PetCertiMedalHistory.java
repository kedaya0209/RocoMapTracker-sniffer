// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetCertiMedalHistory(
    int activityId,
    int petChains
) {
    public static PetCertiMedalHistory parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetCertiMedalHistory(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PetCertiMedalHistory parseFrom(java.util.List<ProtoField> fields) {
        return new PetCertiMedalHistory(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
