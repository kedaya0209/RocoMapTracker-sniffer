// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTogetherCatchPetForGiftingReq(
    int petGid,
    boolean isForCheck
) {
    public static ZoneTogetherCatchPetForGiftingReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTogetherCatchPetForGiftingReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneTogetherCatchPetForGiftingReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTogetherCatchPetForGiftingReq(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
