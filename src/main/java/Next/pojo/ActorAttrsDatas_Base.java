// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorAttrsDatas_Base(
    CreatureAttrs_SimpleAttr32 lv,
    CreatureAttrs_SimpleAttr32 hp,
    CreatureAttrs_ComplexAttr32 hpMax,
    CreatureAttrs_ComplexAttr32 moveSpd,
    List<Integer> attrs
) {
    public static ActorAttrsDatas_Base parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorAttrsDatas_Base(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.CreatureAttrs_ComplexAttr32.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.CreatureAttrs_ComplexAttr32.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readIntList(fields, 10)
        );
    }
    public static ActorAttrsDatas_Base parseFrom(java.util.List<ProtoField> fields) {
        return new ActorAttrsDatas_Base(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.CreatureAttrs_ComplexAttr32.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 21) != null ? Next.pojo.CreatureAttrs_ComplexAttr32.parseFrom(Pojos.readMessage(fields, 21)) : null,
            Pojos.readIntList(fields, 10)
        );
    }
}
