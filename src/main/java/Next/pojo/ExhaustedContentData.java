// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ExhaustedContentData(
    int contentId,
    int exhaustedNum
) {
    public static ExhaustedContentData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ExhaustedContentData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ExhaustedContentData parseFrom(java.util.List<ProtoField> fields) {
        return new ExhaustedContentData(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
