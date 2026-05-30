// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneHomePetUnplaceReq(
    List<ZoneHomePetUnplaceReq_PetUnplaceInfo> petUnplaceInfoList,
    boolean force
) {
    public static ZoneHomePetUnplaceReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePetUnplaceReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneHomePetUnplaceReq_PetUnplaceInfo::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
    public static ZoneHomePetUnplaceReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePetUnplaceReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneHomePetUnplaceReq_PetUnplaceInfo::parseFrom).toList(),
            Pojos.readBool(fields, 3)
        );
    }
}
