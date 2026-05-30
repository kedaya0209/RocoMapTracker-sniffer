// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomePetUnplaceReq_PetUnplaceInfo(
    long npcObjId,
    long furnitureGuid
) {
    public static ZoneHomePetUnplaceReq_PetUnplaceInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePetUnplaceReq_PetUnplaceInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneHomePetUnplaceReq_PetUnplaceInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePetUnplaceReq_PetUnplaceInfo(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
