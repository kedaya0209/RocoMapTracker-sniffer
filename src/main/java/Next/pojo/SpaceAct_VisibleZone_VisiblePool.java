// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_VisibleZone_VisiblePool(
    int areaCfgId,
    long poolId,
    List<SpaceAct_VisibleZone_VisiblePlayer> players,
    byte[] cellIdStr
) {
    public static SpaceAct_VisibleZone_VisiblePool parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_VisibleZone_VisiblePool(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SpaceAct_VisibleZone_VisiblePlayer::parseFrom).toList(),
            Pojos.readBytes(fields, 4)
        );
    }
    public static SpaceAct_VisibleZone_VisiblePool parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_VisibleZone_VisiblePool(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.SpaceAct_VisibleZone_VisiblePlayer::parseFrom).toList(),
            Pojos.readBytes(fields, 4)
        );
    }
}
