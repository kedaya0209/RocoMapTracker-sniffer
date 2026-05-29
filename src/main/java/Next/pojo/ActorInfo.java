// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo(
    int actorDetailType,
    ActorInfo_Npc npc,
    ActorInfo_Avatar avatar,
    ActorInfo_Monster monster
) {
    public static ActorInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ActorInfo_Npc.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.ActorInfo_Avatar.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ActorInfo_Monster.parseFrom(Pojos.readMessage(fields, 14)) : null
        );
    }
    public static ActorInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.ActorInfo_Npc.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.ActorInfo_Avatar.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readMessage(fields, 14) != null ? Next.pojo.ActorInfo_Monster.parseFrom(Pojos.readMessage(fields, 14)) : null
        );
    }
}
