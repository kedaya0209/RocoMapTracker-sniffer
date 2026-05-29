// Generated from zonesvr_notify.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeInteractedNotify(
    int type,
    PlayerInteractBriefInfo playerInfo,
    int cancelStatus,
    boolean autoConfirmVisiting
) {
    public static ZoneSceneBeInteractedNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeInteractedNotify(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerInteractBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0),
            Pojos.readBool(fields, 4)
        );
    }
    public static ZoneSceneBeInteractedNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeInteractedNotify(
            Pojos.readInt(fields, 1, 0),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerInteractBriefInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readInt(fields, 3, 0),
            Pojos.readBool(fields, 4)
        );
    }
}
