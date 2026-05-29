// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerCopyData(
    int srcUin,
    int copyTime
) {
    public static PlayerCopyData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerCopyData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerCopyData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerCopyData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
