// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmBatchGetPlayerBriefInfoReq(
    List<Integer> uinList,
    List<Integer> groups
) {
    public static ZoneGmBatchGetPlayerBriefInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmBatchGetPlayerBriefInfoReq(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static ZoneGmBatchGetPlayerBriefInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmBatchGetPlayerBriefInfoReq(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
