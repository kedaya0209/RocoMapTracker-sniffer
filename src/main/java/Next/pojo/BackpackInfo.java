// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record BackpackInfo(
    int gid,
    int idx
) {
    public static BackpackInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BackpackInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static BackpackInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BackpackInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
