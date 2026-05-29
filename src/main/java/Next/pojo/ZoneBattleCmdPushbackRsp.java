// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBattleCmdPushbackRsp(
    RetInfo retInfo,
    boolean isCaught,
    int catchProbability,
    List<Inner_FriendTypeInfo> friTypeList,
    boolean hasNpcDelay,
    int stateRetCode,
    BattleSyncData syncData,
    BattleRoundFlowReq req,
    BattleRoleMagicOpInfo magicOpInfo,
    int comboSkillIdx,
    int wlReqId,
    int maxErrReqId,
    boolean ignored,
    int round
) {
    public static ZoneBattleCmdPushbackRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleCmdPushbackRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.Inner_FriendTypeInfo::parseFrom).toList(),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.BattleSyncData.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.BattleRoleMagicOpInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readBool(fields, 23),
            Pojos.readInt(fields, 30)
        );
    }
    public static ZoneBattleCmdPushbackRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleCmdPushbackRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.Inner_FriendTypeInfo::parseFrom).toList(),
            Pojos.readBool(fields, 7),
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.BattleSyncData.parseFrom(Pojos.readMessage(fields, 10)) : null,
            Pojos.readMessage(fields, 11) != null ? Next.pojo.BattleRoundFlowReq.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readMessage(fields, 12) != null ? Next.pojo.BattleRoleMagicOpInfo.parseFrom(Pojos.readMessage(fields, 12)) : null,
            Pojos.readInt(fields, 20),
            Pojos.readInt(fields, 21),
            Pojos.readInt(fields, 22),
            Pojos.readBool(fields, 23),
            Pojos.readInt(fields, 30)
        );
    }
}
