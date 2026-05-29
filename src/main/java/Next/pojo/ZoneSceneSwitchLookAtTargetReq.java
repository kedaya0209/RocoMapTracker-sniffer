// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneSwitchLookAtTargetReq(
    long targetActorId,
    boolean enable
) {
    public static ZoneSceneSwitchLookAtTargetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneSwitchLookAtTargetReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneSceneSwitchLookAtTargetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneSwitchLookAtTargetReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
