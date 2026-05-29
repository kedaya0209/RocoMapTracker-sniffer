// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneUpgradeCarryonRsp(
    RetInfo retInfo,
    Possession resCarryon
) {
    public static ZoneUpgradeCarryonRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneUpgradeCarryonRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Possession.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneUpgradeCarryonRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneUpgradeCarryonRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Possession.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
