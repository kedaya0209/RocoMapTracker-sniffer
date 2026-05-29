// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTriggerTeachingBattleReq(
    int teachingType,
    int id
) {
    public static ZoneTriggerTeachingBattleReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTriggerTeachingBattleReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneTriggerTeachingBattleReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTriggerTeachingBattleReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2)
        );
    }
}
