// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_HabitatNeighborInfoChange(
    long actorId,
    HabitatNeighborRelationInfo changeHabitatNeighborDatas,
    List<Integer> delHabitatIds
) {
    public static SpaceAct_HabitatNeighborInfoChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_HabitatNeighborInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HabitatNeighborRelationInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
    public static SpaceAct_HabitatNeighborInfoChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_HabitatNeighborInfoChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.HabitatNeighborRelationInfo.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 3)
        );
    }
}
