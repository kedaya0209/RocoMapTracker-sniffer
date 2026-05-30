// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorWorldCombatSkillInfo(
    List<Long> skillBuffId,
    List<Long> skillSpawnNpcList
) {
    public static ActorWorldCombatSkillInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorWorldCombatSkillInfo(
            Pojos.readLongList(fields, 1),
            Pojos.readLongList(fields, 2)
        );
    }
    public static ActorWorldCombatSkillInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorWorldCombatSkillInfo(
            Pojos.readLongList(fields, 1),
            Pojos.readLongList(fields, 2)
        );
    }
}
