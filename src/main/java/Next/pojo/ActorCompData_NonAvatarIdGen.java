// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_NonAvatarIdGen(
    List<Long> actorMaxIds
) {
    public static ActorCompData_NonAvatarIdGen parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_NonAvatarIdGen(
            Pojos.readLongList(fields, 1)
        );
    }
    public static ActorCompData_NonAvatarIdGen parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_NonAvatarIdGen(
            Pojos.readLongList(fields, 1)
        );
    }
}
