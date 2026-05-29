// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerDeletionInfo(
    boolean finished
) {
    public static PlayerDeletionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerDeletionInfo(
            Pojos.readBool(fields, 1)
        );
    }
    public static PlayerDeletionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerDeletionInfo(
            Pojos.readBool(fields, 1)
        );
    }
}
