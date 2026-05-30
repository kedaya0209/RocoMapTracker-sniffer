// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityNpcChallengeData_Module(
    int moduleId,
    List<PlayerActivityInfo_ChallengeLevel> levels,
    boolean isReaded
) {
    public static PlayerActivityInfo_ActivityNpcChallengeData_Module parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityNpcChallengeData_Module(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ChallengeLevel::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
    public static PlayerActivityInfo_ActivityNpcChallengeData_Module parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityNpcChallengeData_Module(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ChallengeLevel::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
}
