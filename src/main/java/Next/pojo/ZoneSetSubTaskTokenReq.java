// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneSetSubTaskTokenReq(
    List<ZoneSetSubTaskTokenReq_SetSubTaskTokenAction> action
) {
    public static ZoneSetSubTaskTokenReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSetSubTaskTokenReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneSetSubTaskTokenReq_SetSubTaskTokenAction::parseFrom).toList()
        );
    }
    public static ZoneSetSubTaskTokenReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSetSubTaskTokenReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ZoneSetSubTaskTokenReq_SetSubTaskTokenAction::parseFrom).toList()
        );
    }
}
