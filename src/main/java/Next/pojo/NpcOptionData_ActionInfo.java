// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcOptionData_ActionInfo(
    int actType,
    int actStatus,
    boolean actExecSuccess,
    int boundDialogId,
    int actResultType,
    int dialogId,
    int btleCfgId,
    int acceptTaskId,
    boolean onlyBattlePets,
    boolean includeDeadPets,
    boolean isFixedValue,
    int addPetHpVal,
    int battleResult,
    int chargeBagitemId,
    int chapterId,
    int addRoleEnergyVal,
    int addRoleHpVal,
    int addRoleHpMaxVal,
    int addExpPetGid,
    long timeoutTime,
    int starAwardSubValue,
    boolean canPetSubmit,
    byte[] actParam1,
    byte[] actParam2,
    byte[] actParam3,
    List<Integer> addExpPetGidVec,
    int campPetReportId,
    List<Integer> actParams,
    int nextDialogId,
    int dialogSkipState,
    int clearHalfHpInjure
) {
    public static NpcOptionData_ActionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcOptionData_ActionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 15),
            Pojos.readBool(fields, 16),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readInt(fields, 25),
            Pojos.readLong(fields, 28),
            Pojos.readInt(fields, 29),
            Pojos.readBool(fields, 30),
            Pojos.readBytes(fields, 31),
            Pojos.readBytes(fields, 32),
            Pojos.readBytes(fields, 33),
            Pojos.readIntList(fields, 34),
            Pojos.readInt(fields, 35),
            Pojos.readIntList(fields, 36),
            Pojos.readInt(fields, 37),
            Pojos.readInt(fields, 38),
            Pojos.readInt(fields, 39)
        );
    }
    public static NpcOptionData_ActionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new NpcOptionData_ActionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 13),
            Pojos.readBool(fields, 15),
            Pojos.readBool(fields, 16),
            Pojos.readBool(fields, 17),
            Pojos.readInt(fields, 18),
            Pojos.readInt(fields, 19),
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readInt(fields, 23),
            Pojos.readInt(fields, 24),
            Pojos.readInt(fields, 25),
            Pojos.readLong(fields, 28),
            Pojos.readInt(fields, 29),
            Pojos.readBool(fields, 30),
            Pojos.readBytes(fields, 31),
            Pojos.readBytes(fields, 32),
            Pojos.readBytes(fields, 33),
            Pojos.readIntList(fields, 34),
            Pojos.readInt(fields, 35),
            Pojos.readIntList(fields, 36),
            Pojos.readInt(fields, 37),
            Pojos.readInt(fields, 38),
            Pojos.readInt(fields, 39)
        );
    }
}
