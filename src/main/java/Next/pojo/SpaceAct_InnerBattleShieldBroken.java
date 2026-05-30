// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_InnerBattleShieldBroken(
    long actorId,
    long worldNpcObjId,
    InnerBattlePetDisplay petInfo,
    long bfdId,
    int battleConfId
) {
    public static SpaceAct_InnerBattleShieldBroken parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_InnerBattleShieldBroken(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.InnerBattlePetDisplay.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static SpaceAct_InnerBattleShieldBroken parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_InnerBattleShieldBroken(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.InnerBattlePetDisplay.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
