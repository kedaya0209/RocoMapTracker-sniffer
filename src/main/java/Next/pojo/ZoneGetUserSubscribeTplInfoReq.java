// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetUserSubscribeTplInfoReq(
    List<Integer> tplTypeList,
    int needOpenlink
) {
    public static ZoneGetUserSubscribeTplInfoReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetUserSubscribeTplInfoReq(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ZoneGetUserSubscribeTplInfoReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetUserSubscribeTplInfoReq(
            Pojos.readIntList(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
