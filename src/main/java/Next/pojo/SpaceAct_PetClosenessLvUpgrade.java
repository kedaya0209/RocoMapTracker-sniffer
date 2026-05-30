// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PetClosenessLvUpgrade(
    long petNpcObjId,
    int closenessLv,
    int ownerAvatarUin
) {
    public static SpaceAct_PetClosenessLvUpgrade parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PetClosenessLvUpgrade(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static SpaceAct_PetClosenessLvUpgrade parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PetClosenessLvUpgrade(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
