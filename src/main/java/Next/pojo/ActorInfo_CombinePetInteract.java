// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_CombinePetInteract(
    List<CombineInteractPetInfo> combineInteractPetInfos,
    long waitPetInteractAvatarId
) {
    public static ActorInfo_CombinePetInteract parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_CombinePetInteract(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CombineInteractPetInfo::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
    public static ActorInfo_CombinePetInteract parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_CombinePetInteract(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.CombineInteractPetInfo::parseFrom).toList(),
            Pojos.readLong(fields, 2)
        );
    }
}
