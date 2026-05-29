// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_PetPerception(
    List<Integer> usedContentId
) {
    public static ActorCompData_PetPerception parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_PetPerception(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ActorCompData_PetPerception parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_PetPerception(
            Pojos.readIntList(fields, 1)
        );
    }
}
