// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record InteractActionResult(
    int actionType,
    boolean actionResult,
    int dialogId,
    int bindDialogId,
    int acceptTaskId,
    boolean onlyBattlePets,
    boolean includeDeadPets,
    boolean isFixedValue,
    int addPetHpVal,
    int chargeBagitemId,
    int chapterId,
    int addRoleEnergyVal,
    int petExpAwardType,
    int petExpAwardValue,
    int awardPetGid,
    int addRoleHpVal,
    int addRoleHpMaxVal,
    int starAwardSubValue,
    byte[] actionResultParams,
    int optionExcutableTimes,
    List<Integer> awardPetGidVec,
    int starType,
    int petGiftId,
    int plantId,
    int seedId,
    int itemId,
    int itemCount,
    int experienceGained,
    int clearHalfHpInjure
) {
    public static InteractActionResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new InteractActionResult(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readBytes(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readIntList(fields, 25),
            Pojos.readInt(fields, 26),
            Pojos.readInt(fields, 27),
            Pojos.readInt(fields, 28),
            Pojos.readInt(fields, 30),
            Pojos.readInt(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readInt(fields, 34)
        );
    }
    public static InteractActionResult parseFrom(java.util.List<ProtoField> fields) {
        return new InteractActionResult(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readBool(fields, 10),
            Pojos.readBool(fields, 11),
            Pojos.readBool(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readInt(fields, 15),
            Pojos.readInt(fields, 16),
            Pojos.readInt(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readBytes(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readIntList(fields, 25),
            Pojos.readInt(fields, 26),
            Pojos.readInt(fields, 27),
            Pojos.readInt(fields, 28),
            Pojos.readInt(fields, 30),
            Pojos.readInt(fields, 31),
            Pojos.readInt(fields, 32),
            Pojos.readInt(fields, 33),
            Pojos.readInt(fields, 34)
        );
    }
}
