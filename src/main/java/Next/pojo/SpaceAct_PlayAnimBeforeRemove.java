// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PlayAnimBeforeRemove(
    long actorId
) {
    public static SpaceAct_PlayAnimBeforeRemove parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PlayAnimBeforeRemove(
            Pojos.readLong(fields, 1)
        );
    }
    public static SpaceAct_PlayAnimBeforeRemove parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PlayAnimBeforeRemove(
            Pojos.readLong(fields, 1)
        );
    }
}
