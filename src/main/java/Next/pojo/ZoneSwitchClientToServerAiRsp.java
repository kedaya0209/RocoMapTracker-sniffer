// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSwitchClientToServerAiRsp(
    RetInfo retInfo,
    List<Long> successList
) {
    public static ZoneSwitchClientToServerAiRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSwitchClientToServerAiRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLongList(fields, 2)
        );
    }
    public static ZoneSwitchClientToServerAiRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSwitchClientToServerAiRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLongList(fields, 2)
        );
    }
}
