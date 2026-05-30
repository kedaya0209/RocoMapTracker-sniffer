// Generated from com_task.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerTaskSwitchInfo(
    int switchId,
    int switchTimes,
    int lastSwitchUpdateTime
) {
    public static PlayerTaskSwitchInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerTaskSwitchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 4)
        );
    }
    public static PlayerTaskSwitchInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerTaskSwitchInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 4)
        );
    }
}
