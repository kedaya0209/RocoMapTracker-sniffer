// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZonePlayerActivityDataChangeNty(
    PlayerActivityInfo_ActivityData activityData
) {
    public static ZonePlayerActivityDataChangeNty parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerActivityDataChangeNty(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerActivityInfo_ActivityData.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZonePlayerActivityDataChangeNty parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerActivityDataChangeNty(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerActivityInfo_ActivityData.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
