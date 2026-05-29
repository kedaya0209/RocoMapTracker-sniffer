// Generated from game_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PbExtendSvrInfo(
    int reserve1
) {
    public static PbExtendSvrInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PbExtendSvrInfo(
            Pojos.readInt(fields, 1)
        );
    }
    public static PbExtendSvrInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PbExtendSvrInfo(
            Pojos.readInt(fields, 1)
        );
    }
}
