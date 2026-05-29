// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MinigameProgress(
    int npcCfgId,
    int value
) {
    public static MinigameProgress parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MinigameProgress(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static MinigameProgress parseFrom(java.util.List<ProtoField> fields) {
        return new MinigameProgress(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
