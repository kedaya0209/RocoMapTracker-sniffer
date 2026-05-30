// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DeletedPetInfo(
    int deleteTime,
    PetData petData
) {
    public static DeletedPetInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DeletedPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static DeletedPetInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DeletedPetInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PetData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
