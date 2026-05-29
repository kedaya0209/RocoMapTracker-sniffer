// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerAbilityInfo(
    List<PlayerAbilityData> abilityInfo,
    int sceneAbilityId
) {
    public static PlayerAbilityInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAbilityInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerAbilityData::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerAbilityInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAbilityInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerAbilityData::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
}
