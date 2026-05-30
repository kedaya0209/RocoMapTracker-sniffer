// Generated from com_account.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record WhitelistTagList(
    List<Integer> tags,
    byte[] oriKey,
    byte[] wx,
    byte[] comment
) {
    public static WhitelistTagList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new WhitelistTagList(
            Pojos.readIntList(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4)
        );
    }
    public static WhitelistTagList parseFrom(java.util.List<ProtoField> fields) {
        return new WhitelistTagList(
            Pojos.readIntList(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4)
        );
    }
}
