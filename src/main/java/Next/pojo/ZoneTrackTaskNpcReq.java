// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneTrackTaskNpcReq(
    List<Integer> taskIdList,
    boolean onlyNotBreakJourney
) {
    public static ZoneTrackTaskNpcReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTrackTaskNpcReq(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneTrackTaskNpcReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTrackTaskNpcReq(
            Pojos.readIntList(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
