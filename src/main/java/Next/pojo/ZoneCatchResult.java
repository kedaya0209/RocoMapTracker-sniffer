// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneCatchResult(
    boolean isCatched,
    int probability,
    boolean isTechSatisfied,
    boolean isDetected,
    GlassInfo glassInfo
) {
    public static ZoneCatchResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneCatchResult(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
    public static ZoneCatchResult parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneCatchResult(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.GlassInfo.parseFrom(Pojos.readMessage(fields, 5)) : null
        );
    }
}
