// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneQueryPlayerSettingsRsp(
    RetInfo retInfo,
    PlayerSettings settings
) {
    public static ZoneQueryPlayerSettingsRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryPlayerSettingsRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSettings.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneQueryPlayerSettingsRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryPlayerSettingsRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSettings.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
