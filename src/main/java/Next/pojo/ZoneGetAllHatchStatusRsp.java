// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetAllHatchStatusRsp(
    RetInfo retInfo,
    List<Integer> eggGid,
    List<Integer> hatchedSecs
) {
    public static ZoneGetAllHatchStatusRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetAllHatchStatusRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static ZoneGetAllHatchStatusRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetAllHatchStatusRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
