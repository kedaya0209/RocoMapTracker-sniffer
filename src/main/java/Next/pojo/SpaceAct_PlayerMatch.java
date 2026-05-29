// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PlayerMatch(
    int matchType,
    long casterUin,
    boolean startOrCancel,
    int castTime,
    int selectHard,
    int battleCfgId
) {
    public static SpaceAct_PlayerMatch parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PlayerMatch(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static SpaceAct_PlayerMatch parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PlayerMatch(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
