// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetPlayerTeachInfoRsp(
    RetInfo retInfo,
    List<PlayerTeachInfo> teachInfos
) {
    public static ZoneGetPlayerTeachInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetPlayerTeachInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerTeachInfo::parseFrom).toList()
        );
    }
    public static ZoneGetPlayerTeachInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetPlayerTeachInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerTeachInfo::parseFrom).toList()
        );
    }
}
