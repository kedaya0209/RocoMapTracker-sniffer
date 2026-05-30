// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetOngoingSubTaskInfoRsp(
    RetInfo retInfo,
    PlayerSubTaskInfo_OngoingSubTaskInfo ongoingSubTaskInfo
) {
    public static ZoneGetOngoingSubTaskInfoRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetOngoingSubTaskInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSubTaskInfo_OngoingSubTaskInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ZoneGetOngoingSubTaskInfoRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetOngoingSubTaskInfoRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerSubTaskInfo_OngoingSubTaskInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
