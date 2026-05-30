// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUnlockTeachConditionReq(
    int clientTrigger
) {
    public static ZoneUnlockTeachConditionReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUnlockTeachConditionReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
    public static ZoneUnlockTeachConditionReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUnlockTeachConditionReq(
            Pojos.readInt(fields, 1, 0)
        );
    }
}
