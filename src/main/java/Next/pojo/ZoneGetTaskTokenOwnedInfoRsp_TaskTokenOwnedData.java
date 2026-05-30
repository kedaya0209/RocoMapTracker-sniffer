// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneGetTaskTokenOwnedInfoRsp_TaskTokenOwnedData(
    int taskTokenId,
    int taskTokenGetTime,
    int subTaskId,
    int isLocked
) {
    public static ZoneGetTaskTokenOwnedInfoRsp_TaskTokenOwnedData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetTaskTokenOwnedInfoRsp_TaskTokenOwnedData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static ZoneGetTaskTokenOwnedInfoRsp_TaskTokenOwnedData parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetTaskTokenOwnedInfoRsp_TaskTokenOwnedData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
