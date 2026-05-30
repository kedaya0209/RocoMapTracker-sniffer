// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetTravelInfo(
    int campContentId,
    int campLv,
    List<Integer> petGid,
    int startTravelSec,
    int advanceNum,
    boolean travelComplete,
    boolean willLayEgg,
    List<PetBriefInfo> petBriefs,
    List<Integer> rewardWPre
) {
    public static PetTravelInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetTravelInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PetBriefInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 9)
        );
    }
    public static PetTravelInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetTravelInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6),
            Pojos.readBool(fields, 7),
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PetBriefInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 9)
        );
    }
}
