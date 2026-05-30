// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeTeamLeaveHomeReq(
    long entryId,
    boolean useSpecialTeleport
) {
    public static ZoneSceneHomeTeamLeaveHomeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeTeamLeaveHomeReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneSceneHomeTeamLeaveHomeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeTeamLeaveHomeReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
