// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Stamina(
    List<StaminaCostData> staminaCostList,
    boolean inNonLandBattle
) {
    public static ActorCompData_Stamina parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Stamina(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.StaminaCostData::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
    public static ActorCompData_Stamina parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Stamina(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.StaminaCostData::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
}
