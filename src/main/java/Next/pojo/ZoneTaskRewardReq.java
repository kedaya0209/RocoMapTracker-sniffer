// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneTaskRewardReq(
    List<Integer> taskList
) {
    public static ZoneTaskRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTaskRewardReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneTaskRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTaskRewardReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
