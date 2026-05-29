// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeTeamInfo(
    int teamType,
    int teamLeaderUin,
    int status,
    List<HomeTeamMemberInfo> members
) {
    public static HomeTeamInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeTeamInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.HomeTeamMemberInfo::parseFrom).toList()
        );
    }
    public static HomeTeamInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeTeamInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessageList(fields, 4).stream().map(Next.pojo.HomeTeamMemberInfo::parseFrom).toList()
        );
    }
}
