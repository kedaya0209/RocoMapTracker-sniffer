// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetSubTaskRsp(
    RetInfo retInfo,
    List<Integer> subTaskId,
    int lastGetTime
) {
    public static ZoneGetSubTaskRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetSubTaskRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneGetSubTaskRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetSubTaskRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
