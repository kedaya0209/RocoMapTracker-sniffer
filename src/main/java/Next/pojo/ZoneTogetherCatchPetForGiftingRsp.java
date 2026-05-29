// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneTogetherCatchPetForGiftingRsp(
    RetInfo retInfo,
    boolean isForCheck,
    int petGid
) {
    public static ZoneTogetherCatchPetForGiftingRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTogetherCatchPetForGiftingRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZoneTogetherCatchPetForGiftingRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTogetherCatchPetForGiftingRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
