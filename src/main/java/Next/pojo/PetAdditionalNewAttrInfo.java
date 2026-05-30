// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetAdditionalNewAttrInfo(
    int addiAttr,
    int type
) {
    public static PetAdditionalNewAttrInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetAdditionalNewAttrInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PetAdditionalNewAttrInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetAdditionalNewAttrInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
