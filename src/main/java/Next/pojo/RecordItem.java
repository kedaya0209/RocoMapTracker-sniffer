// Generated from com_base_types.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record RecordItem(
    String cmd,
    int cmdVal,
    byte[] content,
    byte[] writeTime
) {
    public static RecordItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new RecordItem(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4)
        );
    }
    public static RecordItem parseFrom(java.util.List<ProtoField> fields) {
        return new RecordItem(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3),
            Pojos.readBytes(fields, 4)
        );
    }
}
