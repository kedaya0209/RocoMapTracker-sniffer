// Generated from com_pet_egg.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetEggCoreRecord(
    int eggGid,
    PetEggCore eggCore
) {
    public static PetEggCoreRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetEggCoreRecord(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetEggCore.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static PetEggCoreRecord parseFrom(java.util.List<ProtoField> fields) {
        return new PetEggCoreRecord(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetEggCore.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
