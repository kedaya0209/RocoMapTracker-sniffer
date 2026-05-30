// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmSwitchClientAiToServerRsp(
    RetInfo retInfo,
    List<Long> successList
) {
    public static ZoneGmSwitchClientAiToServerRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmSwitchClientAiToServerRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLongList(fields, 2)
        );
    }
    public static ZoneGmSwitchClientAiToServerRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmSwitchClientAiToServerRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLongList(fields, 2)
        );
    }
}
