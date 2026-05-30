// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AiExtraData(
    List<AiExtraRoleData> data
) {
    public static AiExtraData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AiExtraData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AiExtraRoleData::parseFrom).toList()
        );
    }
    public static AiExtraData parseFrom(java.util.List<ProtoField> fields) {
        return new AiExtraData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AiExtraRoleData::parseFrom).toList()
        );
    }
}
