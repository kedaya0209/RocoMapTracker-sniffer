// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneWorldLevelTaskOpenRsp(
    RetInfo retInfo,
    int worldLevelTaskId,
    int taskState
) {
    public static ZoneWorldLevelTaskOpenRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneWorldLevelTaskOpenRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static ZoneWorldLevelTaskOpenRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneWorldLevelTaskOpenRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
