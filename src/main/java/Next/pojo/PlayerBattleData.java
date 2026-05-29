// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBattleData(
    CreateBattleInfo createBattleInfo,
    long battleInstId,
    long battleFieldId,
    SourceData sourceData,
    int settleStep,
    BattleSettleInfo settleInfo,
    int sceneRpcIng,
    int sceneRpcCnt,
    PlayerBattleData_SceneSettleInfo sceneSettleInfo,
    boolean needCheck,
    PlayerBattleData_ObserveBattleData observeBattle,
    int bfidIncId,
    int z2bCreateIng
) {
    public static PlayerBattleData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBattleData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CreateBattleInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.SourceData.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6, 0),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BattleSettleInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PlayerBattleData_SceneSettleInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readBool(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerBattleData_ObserveBattleData.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 15)
        );
    }
    public static PlayerBattleData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBattleData(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.CreateBattleInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.SourceData.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6, 0),
            Pojos.readMessage(fields, 7) != null ? Next.pojo.BattleSettleInfo.parseFrom(Pojos.readMessage(fields, 7)) : null,
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 13),
            Pojos.readMessage(fields, 9) != null ? Next.pojo.PlayerBattleData_SceneSettleInfo.parseFrom(Pojos.readMessage(fields, 9)) : null,
            Pojos.readBool(fields, 10),
            Pojos.readMessage(fields, 11) != null ? Next.pojo.PlayerBattleData_ObserveBattleData.parseFrom(Pojos.readMessage(fields, 11)) : null,
            Pojos.readInt(fields, 12),
            Pojos.readInt(fields, 15)
        );
    }
}
