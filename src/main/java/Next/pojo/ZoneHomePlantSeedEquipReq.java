// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneHomePlantSeedEquipReq(
    List<ZoneHomePlantSeedEquipReq_HomePlantSeedModifyInfo> modifyInfo
) {
    public static ZoneHomePlantSeedEquipReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePlantSeedEquipReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneHomePlantSeedEquipReq_HomePlantSeedModifyInfo::parseFrom).toList()
        );
    }
    public static ZoneHomePlantSeedEquipReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePlantSeedEquipReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneHomePlantSeedEquipReq_HomePlantSeedModifyInfo::parseFrom).toList()
        );
    }
}
