// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlatInfo(
    int platId,
    int worldId,
    int cliLoginChannel,
    int cliStartupChannel,
    byte[] regChannel,
    byte[] regGameChannel
) {
    public static PlatInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlatInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readBytes(fields, 6)
        );
    }
    public static PlatInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlatInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readBytes(fields, 5),
            Pojos.readBytes(fields, 6)
        );
    }
}
