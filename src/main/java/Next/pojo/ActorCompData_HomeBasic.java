// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_HomeBasic(
    PlayerHomeBriefInfo homeBriefInfo,
    PlayerHomeTeamInfo homeTeamInfo
) {
    public static ActorCompData_HomeBasic parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_HomeBasic(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerHomeBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerHomeTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ActorCompData_HomeBasic parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_HomeBasic(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayerHomeBriefInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerHomeTeamInfo.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
