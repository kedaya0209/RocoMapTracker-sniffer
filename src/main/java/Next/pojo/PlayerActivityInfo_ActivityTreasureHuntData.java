// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityTreasureHuntData(
    List<PlayerActivityInfo_ActivityTreasureHuntData_TreasureData> treasureData,
    boolean unlock
) {
    public static PlayerActivityInfo_ActivityTreasureHuntData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityTreasureHuntData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerActivityInfo_ActivityTreasureHuntData_TreasureData::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
    public static PlayerActivityInfo_ActivityTreasureHuntData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityTreasureHuntData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerActivityInfo_ActivityTreasureHuntData_TreasureData::parseFrom).toList(),
            Pojos.readBool(fields, 2)
        );
    }
}
