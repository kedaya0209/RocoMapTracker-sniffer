// Generated from com_misc.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SystemExecuteTime(
    String key,
    SystemExecuteTime_TimeCost value
) {
    public static SystemExecuteTime parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SystemExecuteTime(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SystemExecuteTime_TimeCost.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SystemExecuteTime parseFrom(java.util.List<ProtoField> fields) {
        return new SystemExecuteTime(
            Pojos.readString(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SystemExecuteTime_TimeCost.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
