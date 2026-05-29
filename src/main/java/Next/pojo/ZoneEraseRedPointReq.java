// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneEraseRedPointReq(
    List<RedPointGroup> pointGroup
) {
    public static ZoneEraseRedPointReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneEraseRedPointReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RedPointGroup::parseFrom).toList()
        );
    }
    public static ZoneEraseRedPointReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneEraseRedPointReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RedPointGroup::parseFrom).toList()
        );
    }
}
