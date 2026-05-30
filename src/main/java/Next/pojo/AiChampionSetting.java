// Generated from game_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record AiChampionSetting(
    int championId,
    AiSetting aiSetting
) {
    public static AiChampionSetting parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AiChampionSetting(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AiSetting.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static AiChampionSetting parseFrom(java.util.List<ProtoField> fields) {
        return new AiChampionSetting(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.AiSetting.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
