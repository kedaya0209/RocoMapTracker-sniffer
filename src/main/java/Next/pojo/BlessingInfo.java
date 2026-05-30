// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BlessingInfo(
    String fromPlayerName,
    String fromPetName
) {
    public static BlessingInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BlessingInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static BlessingInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BlessingInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
