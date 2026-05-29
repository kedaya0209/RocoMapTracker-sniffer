// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityPartData(
    int activityPartId,
    int state,
    PlayerActivityInfo_ActivityPartData_ActivityPartParam param,
    int openTimestamp
) {
    public static PlayerActivityInfo_ActivityPartData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityPartData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerActivityInfo_ActivityPartData_ActivityPartParam.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
    public static PlayerActivityInfo_ActivityPartData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityPartData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerActivityInfo_ActivityPartData_ActivityPartParam.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
}
