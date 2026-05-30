// Generated from com_pet_medal.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetMedalBucket(
    int hashId,
    List<PetMedalDetail> detailList
) {
    public static PetMedalBucket parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalBucket(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetMedalDetail::parseFrom).toList()
        );
    }
    public static PetMedalBucket parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalBucket(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetMedalDetail::parseFrom).toList()
        );
    }
}
