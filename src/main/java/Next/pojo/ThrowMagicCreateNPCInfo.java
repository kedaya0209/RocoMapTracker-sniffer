// Generated from com_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ThrowMagicCreateNPCInfo(
    int npcRefreshConfId,
    Point createPt
) {
    public static ThrowMagicCreateNPCInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowMagicCreateNPCInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static ThrowMagicCreateNPCInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowMagicCreateNPCInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
