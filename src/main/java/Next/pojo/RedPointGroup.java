// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record RedPointGroup(
    int reasonType,
    List<byte[]> pointData
) {
    public static RedPointGroup parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RedPointGroup(
            Pojos.readInt(fields, 1),
            Pojos.readBytesList(fields, 2)
        );
    }
    public static RedPointGroup parseFrom(java.util.List<ProtoField> fields) {
        return new RedPointGroup(
            Pojos.readInt(fields, 1),
            Pojos.readBytesList(fields, 2)
        );
    }
}
