// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetAbilityInfo(
    List<PetAbilityData> abilityData
) {
    public static PetAbilityInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetAbilityInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetAbilityData::parseFrom).toList()
        );
    }
    public static PetAbilityInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetAbilityInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetAbilityData::parseFrom).toList()
        );
    }
}
