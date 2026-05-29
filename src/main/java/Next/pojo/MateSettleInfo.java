// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record MateSettleInfo(
    int mateUin,
    boolean catchFlower
) {
    public static MateSettleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MateSettleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static MateSettleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MateSettleInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
