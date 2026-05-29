// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorPartData_AvatarBase(
    List<Integer> enteredSceneCfgId
) {
    public static ActorPartData_AvatarBase parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorPartData_AvatarBase(
            Pojos.readIntList(fields, 11)
        );
    }
    public static ActorPartData_AvatarBase parseFrom(java.util.List<ProtoField> fields) {
        return new ActorPartData_AvatarBase(
            Pojos.readIntList(fields, 11)
        );
    }
}
