// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityUpData_HatchUpStats(
    int eggId,
    int petId,
    int hatchFinishTime,
    int mutationType,
    GlassInfo glassInfo
) {
    public static PlayerActivityInfo_ActivityUpData_HatchUpStats parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityUpData_HatchUpStats(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static PlayerActivityInfo_ActivityUpData_HatchUpStats parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityUpData_HatchUpStats(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
