// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityStageData(
    List<PlayerActivityInfo_ActivityStageData_SubData> subStageData
) {
    public static PlayerActivityInfo_ActivityStageData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityStageData(
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerActivityInfo_ActivityStageData_SubData::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityStageData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityStageData(
            Pojos.readMessageList(fields, 8).stream().map(Next.pojo.PlayerActivityInfo_ActivityStageData_SubData::parseFrom).toList()
        );
    }
}
