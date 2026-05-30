// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneChooseNewFactionNotify(
    int activityId,
    List<FinishFactionItem> finishedFaction
) {
    public static ZoneChooseNewFactionNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChooseNewFactionNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FinishFactionItem::parseFrom).toList()
        );
    }
    public static ZoneChooseNewFactionNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChooseNewFactionNotify(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.FinishFactionItem::parseFrom).toList()
        );
    }
}
