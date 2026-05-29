// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SvrAISyncCommonInfo(
    int aiSeqId
) {
    public static SvrAISyncCommonInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SvrAISyncCommonInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static SvrAISyncCommonInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SvrAISyncCommonInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
