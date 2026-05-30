// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PossessionInfo(
    int slotSize,
    List<Possession> item,
    boolean autoSupply
) {
    public static PossessionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PossessionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Possession::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
    public static PossessionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PossessionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Possession::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
}
