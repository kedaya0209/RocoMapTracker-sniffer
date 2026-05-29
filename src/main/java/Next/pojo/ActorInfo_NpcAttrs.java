// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_NpcAttrs(
    int hp,
    int hpMax
) {
    public static ActorInfo_NpcAttrs parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcAttrs(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ActorInfo_NpcAttrs parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcAttrs(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
