// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_AuraInfoChange(
    long actorId,
    List<ActorInfo_Aura> auraInfo,
    List<RemoveAuraInfo> removedAuras
) {
    public static SpaceAct_AuraInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_AuraInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorInfo_Aura::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.RemoveAuraInfo::parseFrom).toList()
        );
    }
    public static SpaceAct_AuraInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_AuraInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ActorInfo_Aura::parseFrom).toList(),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.RemoveAuraInfo::parseFrom).toList()
        );
    }
}
