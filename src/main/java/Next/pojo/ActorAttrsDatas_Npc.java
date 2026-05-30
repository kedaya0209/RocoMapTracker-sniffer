// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorAttrsDatas_Npc(
    ActorAttrsDatas_Base baseAttrs,
    List<Integer> attrs
) {
    public static ActorAttrsDatas_Npc parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorAttrsDatas_Npc(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorAttrsDatas_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 10)
        );
    }
    public static ActorAttrsDatas_Npc parseFrom(java.util.List<ProtoField> fields) {
        return new ActorAttrsDatas_Npc(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorAttrsDatas_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 10)
        );
    }
}
