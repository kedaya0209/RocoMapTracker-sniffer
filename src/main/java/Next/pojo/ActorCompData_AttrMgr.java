// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_AttrMgr(
    ActorAttrsDatas_Base baseAttrs,
    ActorAttrsDatas_Avatar avatarAttrs,
    ActorAttrsDatas_Npc npcAttrs
) {
    public static ActorCompData_AttrMgr parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_AttrMgr(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorAttrsDatas_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorAttrsDatas_Avatar.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorAttrsDatas_Npc.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ActorCompData_AttrMgr parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_AttrMgr(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.ActorAttrsDatas_Base.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorAttrsDatas_Avatar.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.ActorAttrsDatas_Npc.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
