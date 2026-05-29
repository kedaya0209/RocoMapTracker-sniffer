// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleLoadFinishReq(
    List<PetPosition> posInfo,
    Position battleCenter,
    int battleRadius,
    List<Integer> observeAvailablePos
) {
    public static ZoneBattleLoadFinishReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleLoadFinishReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetPosition::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
    public static ZoneBattleLoadFinishReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleLoadFinishReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetPosition::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3),
            Pojos.readIntList(fields, 4)
        );
    }
}
