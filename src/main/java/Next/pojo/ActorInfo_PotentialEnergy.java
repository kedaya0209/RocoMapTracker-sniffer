// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_PotentialEnergy(
    boolean enabled,
    List<Integer> potentialEnergy
) {
    public static ActorInfo_PotentialEnergy parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_PotentialEnergy(
            Pojos.readBool(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static ActorInfo_PotentialEnergy parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_PotentialEnergy(
            Pojos.readBool(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
