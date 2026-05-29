// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ActivityPartData_ActivityPartParam(
    int param1,
    String param2
) {
    public static PlayerActivityInfo_ActivityPartData_ActivityPartParam parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ActivityPartData_ActivityPartParam(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
    public static PlayerActivityInfo_ActivityPartData_ActivityPartParam parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ActivityPartData_ActivityPartParam(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2)
        );
    }
}
