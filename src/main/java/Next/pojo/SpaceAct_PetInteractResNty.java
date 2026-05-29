// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_PetInteractResNty(
    long npcId,
    int status,
    int petInteractCfgId,
    int optionId,
    long petNpcId,
    List<Long> combineInteractPetNpcIds
) {
    public static SpaceAct_PetInteractResNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PetInteractResNty(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLongList(fields, 6)
        );
    }
    public static SpaceAct_PetInteractResNty parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PetInteractResNty(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readLongList(fields, 6)
        );
    }
}
