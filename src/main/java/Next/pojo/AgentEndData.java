// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AgentEndData(
    int battleResult,
    BattleStats stats,
    StartArg startArgs,
    BattleStartArg battleStartArg
) {
    public static AgentEndData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AgentEndData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleStats.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.StartArg.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleStartArg.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static AgentEndData parseFrom(java.util.List<ProtoField> fields) {
        return new AgentEndData(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleStats.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.StartArg.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleStartArg.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
