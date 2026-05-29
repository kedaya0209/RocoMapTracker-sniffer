// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetLevelAwardRsp(
    RetInfo retInfo,
    PlayerLevelAwardInfo awards
) {
    public static ZoneGetLevelAwardRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetLevelAwardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerLevelAwardInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGetLevelAwardRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetLevelAwardRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerLevelAwardInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
