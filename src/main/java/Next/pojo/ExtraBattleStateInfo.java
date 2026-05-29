// Generated from nrcai.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ExtraBattleStateInfo(
    List<Integer> requestActions,
    BattleExtraRoleInfo playerTeam,
    BattleExtraRoleInfo enemyTeam
) {
    public static ExtraBattleStateInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ExtraBattleStateInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleExtraRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleExtraRoleInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ExtraBattleStateInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ExtraBattleStateInfo(
            Pojos.readIntList(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.BattleExtraRoleInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.BattleExtraRoleInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
