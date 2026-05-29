// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleRoleLeaveNotify(
    int playerUin,
    int reason,
    int seqNum
) {
    public static ZoneBattleRoleLeaveNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleRoleLeaveNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneBattleRoleLeaveNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleRoleLeaveNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3)
        );
    }
}
