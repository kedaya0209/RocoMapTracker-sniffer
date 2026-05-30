// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneDotsComponentSyncReq(
    long actorId,
    List<BytesData> componentDatas
) {
    public static ZoneDotsComponentSyncReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneDotsComponentSyncReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BytesData::parseFrom).toList()
        );
    }
    public static ZoneDotsComponentSyncReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneDotsComponentSyncReq(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BytesData::parseFrom).toList()
        );
    }
}
