// Generated from game_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record AiSettingList(
    List<AiChampionSetting> aiList
) {
    public static AiSettingList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new AiSettingList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AiChampionSetting::parseFrom).toList()
        );
    }
    public static AiSettingList parseFrom(java.util.List<ProtoField> fields) {
        return new AiSettingList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.AiChampionSetting::parseFrom).toList()
        );
    }
}
