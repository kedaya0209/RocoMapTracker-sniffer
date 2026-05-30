// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSetSubTaskTokenReq_SetSubTaskTokenAction(
    int subTaskId,
    List<PlayerSubTaskInfo_TaskTokenOwnedInfo> taskTokenOwnedInfo
) {
    public static ZoneSetSubTaskTokenReq_SetSubTaskTokenAction parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetSubTaskTokenReq_SetSubTaskTokenAction(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerSubTaskInfo_TaskTokenOwnedInfo::parseFrom).toList()
        );
    }
    public static ZoneSetSubTaskTokenReq_SetSubTaskTokenAction parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetSubTaskTokenReq_SetSubTaskTokenAction(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerSubTaskInfo_TaskTokenOwnedInfo::parseFrom).toList()
        );
    }
}
