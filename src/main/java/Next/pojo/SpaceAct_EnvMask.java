// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_EnvMask(
    long actorId,
    int envMask,
    List<Integer> banType,
    List<Integer> banRideSockets
) {
    public static SpaceAct_EnvMask parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_EnvMask(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
    public static SpaceAct_EnvMask parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_EnvMask(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
}
