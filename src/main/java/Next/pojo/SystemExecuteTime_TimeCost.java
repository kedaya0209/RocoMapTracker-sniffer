// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SystemExecuteTime_TimeCost(
    long startTime,
    long costTime
) {
    public static SystemExecuteTime_TimeCost parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SystemExecuteTime_TimeCost(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static SystemExecuteTime_TimeCost parseFrom(java.util.List<ProtoField> fields) {
        return new SystemExecuteTime_TimeCost(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
