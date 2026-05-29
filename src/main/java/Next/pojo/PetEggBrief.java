// Generated from com_pet_egg.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetEggBrief(
    int confId,
    int height,
    int weight,
    int hatchedSecs,
    int lastHatchUpdateSec,
    int maxHatchedSecs,
    int startHatchTime,
    int src,
    boolean isPrecious,
    String fromPlayerName,
    String fromPetName,
    int fromPlayerUin,
    int fromPetGid,
    int randomEggConf,
    int mutationType,
    GlassInfo glassInfo,
    List<Integer> skillDamType,
    int preciousEggType,
    int ballId,
    int eggPieceId
) {
    public static PetEggBrief parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetEggBrief(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10, 0),
            Pojos.readBool(fields, 11),
            Pojos.readString(fields, 13),
            Pojos.readString(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readIntList(fields, 20),
            Pojos.readInt(fields, 21, 0),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23)
        );
    }
    public static PetEggBrief parseFrom(java.util.List<ProtoField> fields) {
        return new PetEggBrief(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 9),
            Pojos.readInt(fields, 10, 0),
            Pojos.readBool(fields, 11),
            Pojos.readString(fields, 13),
            Pojos.readString(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readMessage(fields, 19) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 19)) : null,
            Pojos.readIntList(fields, 20),
            Pojos.readInt(fields, 21, 0),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23)
        );
    }
}
