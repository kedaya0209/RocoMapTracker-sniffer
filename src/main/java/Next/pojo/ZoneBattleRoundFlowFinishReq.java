// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleRoundFlowFinishReq(
    List<PetPosition> posInfo,
    Position battleCenter,
    int battleRadius,
    int state,
    int seqNum
) {
    public static ZoneBattleRoundFlowFinishReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleRoundFlowFinishReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetPosition::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneBattleRoundFlowFinishReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleRoundFlowFinishReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetPosition::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4, 0),
            Pojos.readInt(fields, 5)
        );
    }
}
