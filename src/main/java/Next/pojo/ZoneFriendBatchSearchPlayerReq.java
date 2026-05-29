// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFriendBatchSearchPlayerReq(
    List<String> openidList
) {
    public static ZoneFriendBatchSearchPlayerReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFriendBatchSearchPlayerReq(
            Pojos.readStringList(fields, 1)
        );
    }
    public static ZoneFriendBatchSearchPlayerReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFriendBatchSearchPlayerReq(
            Pojos.readStringList(fields, 1)
        );
    }
}
