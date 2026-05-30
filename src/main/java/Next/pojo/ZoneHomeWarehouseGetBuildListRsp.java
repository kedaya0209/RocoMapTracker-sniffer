// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneHomeWarehouseGetBuildListRsp(
    RetInfo retInfo,
    List<Integer> dingList,
    List<Integer> homeList,
    long nextUpdateTimestamp,
    List<Integer> selfList
) {
    public static ZoneHomeWarehouseGetBuildListRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHomeWarehouseGetBuildListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
    public static ZoneHomeWarehouseGetBuildListRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHomeWarehouseGetBuildListRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4),
            Pojos.readIntList(fields, 5)
        );
    }
}
