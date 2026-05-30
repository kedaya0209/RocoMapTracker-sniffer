// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_VisibleCircle_VisibleCircle(
    long circleId,
    List<SpaceAct_VisibleCircle_CircleMember> members
) {
    public static SpaceAct_VisibleCircle_VisibleCircle parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_VisibleCircle_VisibleCircle(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SpaceAct_VisibleCircle_CircleMember::parseFrom).toList()
        );
    }
    public static SpaceAct_VisibleCircle_VisibleCircle parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_VisibleCircle_VisibleCircle(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SpaceAct_VisibleCircle_CircleMember::parseFrom).toList()
        );
    }
}
