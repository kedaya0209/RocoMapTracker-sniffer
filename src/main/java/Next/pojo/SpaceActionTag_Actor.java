// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceActionTag_Actor(
    long actorId
) {
    public static SpaceActionTag_Actor parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceActionTag_Actor(
            Pojos.readLong(fields, 1)
        );
    }
    public static SpaceActionTag_Actor parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceActionTag_Actor(
            Pojos.readLong(fields, 1)
        );
    }
}
