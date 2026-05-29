// Generated from battle_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BattleRoundFlowReq(
    int reqType,
    BattleCastSkillReq castSkill,
    BattleChangePetReq changePet,
    BattleUseItemReq useItem,
    BattleCatchPetReq catchPet,
    BattleIdleReq idle,
    BattleSkillStateReq skillState,
    BattleRoleMagicOpReq magicOp
) {
    public static BattleRoundFlowReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattleRoundFlowReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleCastSkillReq.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleChangePetReq.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleUseItemReq.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BattleCatchPetReq.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BattleIdleReq.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BattleSkillStateReq.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.BattleRoleMagicOpReq.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
    public static BattleRoundFlowReq parseFrom(java.util.List<ProtoField> fields) {
        return new BattleRoundFlowReq(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleCastSkillReq.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleChangePetReq.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.BattleUseItemReq.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readMessage(fields, 5) != null ? Next.pojo.BattleCatchPetReq.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readMessage(fields, 6) != null ? Next.pojo.BattleIdleReq.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BattleSkillStateReq.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readMessage(fields, 8) != null ? Next.pojo.BattleRoleMagicOpReq.parseFrom(Pojos.readMessage(fields, 8)) : null
        );
    }
}
