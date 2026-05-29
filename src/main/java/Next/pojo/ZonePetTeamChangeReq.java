// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePetTeamChangeReq(
    List<PetTeam> teams,
    List<Integer> teamIdxs,
    int teamType,
    boolean strictCheck,
    boolean updateBackpack,
    int mainTeamIdx
) {
    public static ZonePetTeamChangeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePetTeamChangeReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetTeam::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static ZonePetTeamChangeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePetTeamChangeReq(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetTeam::parseFrom).toList(),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
