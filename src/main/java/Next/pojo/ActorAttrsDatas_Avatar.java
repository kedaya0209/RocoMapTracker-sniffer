// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorAttrsDatas_Avatar(
    ActorAttrsDatas_Base baseAttrs,
    CreatureAttrs_SimpleAttr32 bodyTemp,
    CreatureAttrs_SimpleAttr32 worldLv,
    CreatureAttrs_SimpleAttr32 stamina,
    CreatureAttrs_SimpleAttr32 staminaMax,
    CreatureAttrs_SimpleAttr32 hpTemporary,
    List<Integer> attrs
) {
    public static ActorAttrsDatas_Avatar parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorAttrsDatas_Avatar(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorAttrsDatas_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readIntList(fields, 10)
        );
    }
    public static ActorAttrsDatas_Avatar parseFrom(java.util.List<ProtoField> fields) {
        return new ActorAttrsDatas_Avatar(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorAttrsDatas_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.CreatureAttrs_SimpleAttr32.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readIntList(fields, 10)
        );
    }
}
