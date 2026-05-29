// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record GeneratedContent(
    int contentId,
    long blockId
) {
    public static GeneratedContent parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GeneratedContent(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 3)
        );
    }
    public static GeneratedContent parseFrom(java.util.List<ProtoField> fields) {
        return new GeneratedContent(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 3)
        );
    }
}
