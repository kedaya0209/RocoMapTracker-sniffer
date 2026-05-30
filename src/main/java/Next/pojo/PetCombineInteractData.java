// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetCombineInteractData(
    int waitPetInteractCfgId,
    long waitPetInteractAvatarId,
    int waitPetInteractOptionId,
    List<CombineInteractPetInfo> combineInteractPetInfos,
    int status
) {
    public static PetCombineInteractData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetCombineInteractData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.CombineInteractPetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5)
        );
    }
    public static PetCombineInteractData parseFrom(java.util.List<ProtoField> fields) {
        return new PetCombineInteractData(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.CombineInteractPetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 5)
        );
    }
}
