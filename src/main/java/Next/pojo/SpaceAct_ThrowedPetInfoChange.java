// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_ThrowedPetInfoChange(
    long actorId,
    List<ActorInfo_ThrowedPet> throwedPetInfos,
    List<Integer> deletePetGids
) {
    public static SpaceAct_ThrowedPetInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ThrowedPetInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActorInfo_ThrowedPet::parseFrom).toList(),
            Pojos.readIntList(fields, 3)
        );
    }
    public static SpaceAct_ThrowedPetInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ThrowedPetInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActorInfo_ThrowedPet::parseFrom).toList(),
            Pojos.readIntList(fields, 3)
        );
    }
}
