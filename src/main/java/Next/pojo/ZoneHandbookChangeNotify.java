// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneHandbookChangeNotify(
    HandbookRecordCollection recordColl,
    boolean isNew,
    int changePetBaseId,
    List<ZoneHandbookChangeNotify_AreaHandbookChangeInfo> areaHbChangeInfo
) {
    public static ZoneHandbookChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHandbookChangeNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HandbookRecordCollection.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.ZoneHandbookChangeNotify_AreaHandbookChangeInfo::parseFrom).toList()
        );
    }
    public static ZoneHandbookChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHandbookChangeNotify(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.HandbookRecordCollection.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessageList(fields, 6).stream().map(Next.pojo.ZoneHandbookChangeNotify_AreaHandbookChangeInfo::parseFrom).toList()
        );
    }
}
