// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneHomeTeamInviteNotify(
    int teamLeaderUin,
    int status,
    HomeTeamMemberInfo teamLeader,
    int teamType
) {
    public static ZoneSceneHomeTeamInviteNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneHomeTeamInviteNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.HomeTeamMemberInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static ZoneSceneHomeTeamInviteNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneHomeTeamInviteNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2, 0),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.HomeTeamMemberInfo.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readInt(fields, 4, 0)
        );
    }
}
