// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneHbCoverChangeNotify(
    int coverIdx,
    int hbAreaType,
    HandbookCoverInfo coverInfo
) {
    public static ZoneHbCoverChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneHbCoverChangeNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.HandbookCoverInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneHbCoverChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneHbCoverChangeNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.HandbookCoverInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
