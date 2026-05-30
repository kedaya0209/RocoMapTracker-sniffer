// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmFeedGridPosRsp_GridPos(
    long gridId,
    List<Position> pos
) {
    public static ZoneGmFeedGridPosRsp_GridPos parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmFeedGridPosRsp_GridPos(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Position::parseFrom).toList()
        );
    }
    public static ZoneGmFeedGridPosRsp_GridPos parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmFeedGridPosRsp_GridPos(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.Position::parseFrom).toList()
        );
    }
}
