// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneReceiveGpContestRewardReq(
    boolean final_,
    int seq
) {
    public static ZoneReceiveGpContestRewardReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneReceiveGpContestRewardReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneReceiveGpContestRewardReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneReceiveGpContestRewardReq(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
