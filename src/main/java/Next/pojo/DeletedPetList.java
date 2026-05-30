// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record DeletedPetList(
    List<DeletedPetInfo> deletePets,
    int minDeleteTime
) {
    public static DeletedPetList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DeletedPetList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DeletedPetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
    public static DeletedPetList parseFrom(java.util.List<ProtoField> fields) {
        return new DeletedPetList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DeletedPetInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
}
