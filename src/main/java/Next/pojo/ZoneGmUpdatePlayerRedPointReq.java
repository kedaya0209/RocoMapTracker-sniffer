// Generated from zone_gm.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGmUpdatePlayerRedPointReq(
    int uin,
    int opType,
    List<RedPointGroup> rpGroup
) {
    public static ZoneGmUpdatePlayerRedPointReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGmUpdatePlayerRedPointReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.RedPointGroup::parseFrom).toList()
        );
    }
    public static ZoneGmUpdatePlayerRedPointReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGmUpdatePlayerRedPointReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.RedPointGroup::parseFrom).toList()
        );
    }
}
