// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetAdditionalNewAttrList(
    List<PetAdditionalNewAttrInfo> addiAttrData
) {
    public static PetAdditionalNewAttrList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetAdditionalNewAttrList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetAdditionalNewAttrInfo::parseFrom).toList()
        );
    }
    public static PetAdditionalNewAttrList parseFrom(java.util.List<ProtoField> fields) {
        return new PetAdditionalNewAttrList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetAdditionalNewAttrInfo::parseFrom).toList()
        );
    }
}
