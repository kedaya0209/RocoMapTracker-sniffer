// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHomePlantSeedEquipReq_HomePlantSeedModifyInfo(
    int gid,
    int bagItemFlags,
    int itemConfId,
    int plantTab
) {
    public static ZoneHomePlantSeedEquipReq_HomePlantSeedModifyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomePlantSeedEquipReq_HomePlantSeedModifyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneHomePlantSeedEquipReq_HomePlantSeedModifyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomePlantSeedEquipReq_HomePlantSeedModifyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
