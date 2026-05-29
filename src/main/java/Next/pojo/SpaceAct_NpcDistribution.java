// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_NpcDistribution(
    List<ActorInfo> distribution
) {
    public static SpaceAct_NpcDistribution parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_NpcDistribution(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_NpcDistribution parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_NpcDistribution(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo::parseFrom).toList()
        );
    }
}
