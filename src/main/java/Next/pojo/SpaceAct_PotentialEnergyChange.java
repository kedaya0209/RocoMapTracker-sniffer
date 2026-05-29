// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PotentialEnergyChange(
    long actorId,
    ActorInfo_PotentialEnergy potentialEnergInfo
) {
    public static SpaceAct_PotentialEnergyChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PotentialEnergyChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_PotentialEnergy.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_PotentialEnergyChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PotentialEnergyChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_PotentialEnergy.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
