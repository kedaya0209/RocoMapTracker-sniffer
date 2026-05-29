// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneModifyPlayerSettingsReq(
    PlayerSettings settings
) {
    public static ZoneModifyPlayerSettingsReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneModifyPlayerSettingsReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerSettings.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneModifyPlayerSettingsReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneModifyPlayerSettingsReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerSettings.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
