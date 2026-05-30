// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SeasonPartInfo(
    int partId,
    int redPointId,
    int itemId,
    List<SeasonPartChangeInfo> changeInfo
) {
    public static SeasonPartInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SeasonPartInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SeasonPartChangeInfo::parseFrom).toList()
        );
    }
    public static SeasonPartInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SeasonPartInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.SeasonPartChangeInfo::parseFrom).toList()
        );
    }
}
