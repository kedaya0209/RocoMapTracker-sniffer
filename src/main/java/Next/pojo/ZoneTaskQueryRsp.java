// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneTaskQueryRsp(
    RetInfo retInfo,
    List<PlayerTaskInfo> taskInfoList
) {
    public static ZoneTaskQueryRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneTaskQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList()
        );
    }
    public static ZoneTaskQueryRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneTaskQueryRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerTaskInfo::parseFrom).toList()
        );
    }
}
