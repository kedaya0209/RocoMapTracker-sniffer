// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSceneDotsExecuteDataReq(
    List<SystemExecuteTime> systemsCostTime,
    long totalCostTime,
    long aiCount
) {
    public static ZoneSceneDotsExecuteDataReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneDotsExecuteDataReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SystemExecuteTime::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
    public static ZoneSceneDotsExecuteDataReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneDotsExecuteDataReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.SystemExecuteTime::parseFrom).toList(),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3)
        );
    }
}
