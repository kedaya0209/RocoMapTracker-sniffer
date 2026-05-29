// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneBeginThrowRsp(
    RetInfo retInfo,
    long throwId,
    QuickChangeMainTeamInfo changeTeam
) {
    public static ZoneSceneBeginThrowRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneBeginThrowRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.QuickChangeMainTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static ZoneSceneBeginThrowRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneBeginThrowRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.QuickChangeMainTeamInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
