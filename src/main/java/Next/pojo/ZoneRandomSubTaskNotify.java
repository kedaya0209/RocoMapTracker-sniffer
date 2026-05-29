// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneRandomSubTaskNotify(
    List<Integer> subTaskId
) {
    public static ZoneRandomSubTaskNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRandomSubTaskNotify(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneRandomSubTaskNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRandomSubTaskNotify(
            Pojos.readIntList(fields, 1)
        );
    }
}
