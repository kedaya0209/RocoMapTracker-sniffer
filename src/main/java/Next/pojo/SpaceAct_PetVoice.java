// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PetVoice(
    long actorId,
    long ownerActorId,
    int petGid
) {
    public static SpaceAct_PetVoice parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PetVoice(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static SpaceAct_PetVoice parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PetVoice(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
