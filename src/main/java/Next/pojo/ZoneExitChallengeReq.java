// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneExitChallengeReq(
    boolean stayDungeon
) {
    public static ZoneExitChallengeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneExitChallengeReq(
            Pojos.readBool(fields, 1)
        );
    }
    public static ZoneExitChallengeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneExitChallengeReq(
            Pojos.readBool(fields, 1)
        );
    }
}
