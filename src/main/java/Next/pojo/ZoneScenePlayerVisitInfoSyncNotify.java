// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneScenePlayerVisitInfoSyncNotify(
    int onlineVisitOwner,
    boolean firstEnterVisiting
) {
    public static ZoneScenePlayerVisitInfoSyncNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneScenePlayerVisitInfoSyncNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneScenePlayerVisitInfoSyncNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneScenePlayerVisitInfoSyncNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
