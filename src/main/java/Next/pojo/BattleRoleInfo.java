// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattleRoleInfo(
    BattleRoleBaseInfo base,
    List<BattlePetInfo> pets,
    List<BattleItemInfo> items,
    BattleRoleMagicOpInfo magicOpInfo,
    BattleRoleMagicSkillInfo magicSkillInfo,
    BattleRoundFlowReq req,
    BattleRoleAdditionInfo roleAddiInfo,
    List<Integer> firstTeam,
    int seqNum,
    List<TaskItemInfo> taskItems
) {
    public static BattleRoleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoleInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleRoleBaseInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattlePetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattleItemInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BattleRoleMagicOpInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BattleRoleMagicSkillInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleRoleAdditionInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.TaskItemInfo::parseFrom).toList()
        );
    }
    public static BattleRoleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoleInfo(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.BattleRoleBaseInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattlePetInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BattleItemInfo::parseFrom).toList(),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BattleRoleMagicOpInfo.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BattleRoleMagicSkillInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 8)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleRoleAdditionInfo.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readIntList(fields, 7),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.TaskItemInfo::parseFrom).toList()
        );
    }
}
