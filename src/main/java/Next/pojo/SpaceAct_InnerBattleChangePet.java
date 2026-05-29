// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_InnerBattleChangePet(
    long actorId,
    long worldNpcObjId,
    InnerBattlePetDisplay petInfo,
    long bfdId,
    int battleConfId,
    boolean isSideB
) {
    public static SpaceAct_InnerBattleChangePet parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_InnerBattleChangePet(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.InnerBattlePetDisplay.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
    public static SpaceAct_InnerBattleChangePet parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_InnerBattleChangePet(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.InnerBattlePetDisplay.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readLong(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
}
