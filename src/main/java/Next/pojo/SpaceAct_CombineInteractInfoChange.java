// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_CombineInteractInfoChange(
    long actorId,
    long waitPetInteractAvatarId,
    List<CombineInteractPetInfo> combineInteractInfos
) {
    public static SpaceAct_CombineInteractInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_CombineInteractInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.CombineInteractPetInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_CombineInteractInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_CombineInteractInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.CombineInteractPetInfo::parseFrom).toList()
        );
    }
}
