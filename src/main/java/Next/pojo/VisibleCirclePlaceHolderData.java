// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record VisibleCirclePlaceHolderData(
    int uin,
    int holdTime
) {
    public static VisibleCirclePlaceHolderData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisibleCirclePlaceHolderData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static VisibleCirclePlaceHolderData parseFrom(java.util.List<ProtoField> fields) {
        return new VisibleCirclePlaceHolderData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
