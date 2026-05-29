// Generated from zone_gm.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmFeedGridPosRsp(
    RetInfo retInfo,
    List<ZoneGmFeedGridPosRsp_GridPos> gridPos
) {
    public static ZoneGmFeedGridPosRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmFeedGridPosRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneGmFeedGridPosRsp_GridPos::parseFrom).toList()
        );
    }
    public static ZoneGmFeedGridPosRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmFeedGridPosRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ZoneGmFeedGridPosRsp_GridPos::parseFrom).toList()
        );
    }
}
