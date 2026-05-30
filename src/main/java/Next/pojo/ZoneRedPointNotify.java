// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneRedPointNotify(
    List<RedPointGroup> rpGroup
) {
    public static ZoneRedPointNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneRedPointNotify(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.RedPointGroup::parseFrom).toList()
        );
    }
    public static ZoneRedPointNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneRedPointNotify(
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.RedPointGroup::parseFrom).toList()
        );
    }
}
