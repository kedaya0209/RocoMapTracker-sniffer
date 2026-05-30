// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_ClientEventResume(
    int event,
    List<byte[]> tag
) {
    public static SpaceAct_ClientEventResume parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_ClientEventResume(
            Pojos.readInt(fields, 1),
            Pojos.readBytesList(fields, 2)
        );
    }
    public static SpaceAct_ClientEventResume parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_ClientEventResume(
            Pojos.readInt(fields, 1),
            Pojos.readBytesList(fields, 2)
        );
    }
}
