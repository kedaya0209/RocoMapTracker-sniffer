// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneRecycleThrowPetReq(
    int gid,
    int reason
) {
    public static ZoneSceneRecycleThrowPetReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneRecycleThrowPetReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
    public static ZoneSceneRecycleThrowPetReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneRecycleThrowPetReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0)
        );
    }
}
