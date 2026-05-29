// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneDungeonDataNotify(
    List<DungeonStateInfo> dungeonStateList
) {
    public static ZoneDungeonDataNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneDungeonDataNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DungeonStateInfo::parseFrom).toList()
        );
    }
    public static ZoneDungeonDataNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneDungeonDataNotify(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.DungeonStateInfo::parseFrom).toList()
        );
    }
}
