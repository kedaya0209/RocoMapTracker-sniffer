// Generated from com_pet_medal.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetMedalRecord(
    int medalConfId,
    int medalType,
    List<PetMedalBucket> buckets
) {
    public static PetMedalRecord parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetMedalBucket::parseFrom).toList()
        );
    }
    public static PetMedalRecord parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalRecord(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.PetMedalBucket::parseFrom).toList()
        );
    }
}
