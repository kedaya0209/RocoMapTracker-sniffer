// Generated from com_magebook.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MageNpcItem(
    int id,
    boolean unlocked,
    boolean awarded
) {
    public static MageNpcItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MageNpcItem(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static MageNpcItem parseFrom(java.util.List<ProtoField> fields) {
        return new MageNpcItem(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
