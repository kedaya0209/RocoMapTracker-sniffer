// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityUpData(
    long lastHatchUpSec,
    List<PlayerActivityInfo_ActivityUpData_HatchUpStats> hatchUpStats
) {
    public static PlayerActivityInfo_ActivityUpData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityUpData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityUpData_HatchUpStats::parseFrom).toList()
        );
    }
    public static PlayerActivityInfo_ActivityUpData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityUpData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerActivityInfo_ActivityUpData_HatchUpStats::parseFrom).toList()
        );
    }
}
