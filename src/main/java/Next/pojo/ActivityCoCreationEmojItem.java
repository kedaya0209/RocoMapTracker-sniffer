// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActivityCoCreationEmojItem(
    int emojType,
    long emojCnt
) {
    public static ActivityCoCreationEmojItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActivityCoCreationEmojItem(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ActivityCoCreationEmojItem parseFrom(java.util.List<ProtoField> fields) {
        return new ActivityCoCreationEmojItem(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
