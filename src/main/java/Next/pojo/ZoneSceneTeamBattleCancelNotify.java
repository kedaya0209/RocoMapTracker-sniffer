// Generated from zonesvr_notify.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneTeamBattleCancelNotify(
    int uin,
    boolean overtime
) {
    public static ZoneSceneTeamBattleCancelNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneTeamBattleCancelNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneSceneTeamBattleCancelNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneTeamBattleCancelNotify(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
