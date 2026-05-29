// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_AIMoveMode(
    int moveMode,
    int moveSubMode,
    int height,
    int heightLerpRate,
    int gravity
) {
    public static ActorInfo_AIMoveMode parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_AIMoveMode(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ActorInfo_AIMoveMode parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_AIMoveMode(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
