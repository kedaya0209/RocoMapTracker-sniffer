// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeginThrowReq(
    int throwType,
    int gid,
    long throwId,
    int itemConfId,
    QuickChangeMainTeamInfo changeTeam
) {
    public static ZoneSceneBeginThrowReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeginThrowReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.QuickChangeMainTeamInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static ZoneSceneBeginThrowReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeginThrowReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.QuickChangeMainTeamInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
