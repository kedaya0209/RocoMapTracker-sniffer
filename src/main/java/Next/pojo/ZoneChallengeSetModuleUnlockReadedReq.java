// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChallengeSetModuleUnlockReadedReq(
    int activityId,
    int moduleId
) {
    public static ZoneChallengeSetModuleUnlockReadedReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChallengeSetModuleUnlockReadedReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneChallengeSetModuleUnlockReadedReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChallengeSetModuleUnlockReadedReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
