// Generated from com_pet_skill.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetCastAura(
    PetPosition petPosInfo,
    List<CastInfo> castInfo
) {
    public static PetCastAura parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetCastAura(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetPosition.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CastInfo::parseFrom).toList()
        );
    }
    public static PetCastAura parseFrom(java.util.List<ProtoField> fields) {
        return new PetCastAura(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PetPosition.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CastInfo::parseFrom).toList()
        );
    }
}
