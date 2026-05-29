// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmGetCommGmCmdsRsp(
    RetInfo retInfo,
    List<CommGmCmd> cmds
) {
    public static ZoneGmGetCommGmCmdsRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmGetCommGmCmdsRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CommGmCmd::parseFrom).toList()
        );
    }
    public static ZoneGmGetCommGmCmdsRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmGetCommGmCmdsRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.CommGmCmd::parseFrom).toList()
        );
    }
}
