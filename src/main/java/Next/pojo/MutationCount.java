// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MutationCount(
    int mutation,
    int cnt
) {
    public static MutationCount parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MutationCount(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static MutationCount parseFrom(java.util.List<ProtoField> fields) {
        return new MutationCount(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
