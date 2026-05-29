// Generated from client.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TeamBattleNPC(
    long actorId
) {
    public static TeamBattleNPC parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TeamBattleNPC(
            Pojos.readLong(fields, 1)
        );
    }
    public static TeamBattleNPC parseFrom(java.util.List<ProtoField> fields) {
        return new TeamBattleNPC(
            Pojos.readLong(fields, 1)
        );
    }
}
