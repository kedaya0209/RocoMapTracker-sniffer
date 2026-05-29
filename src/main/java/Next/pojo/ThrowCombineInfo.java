// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ThrowCombineInfo(
    List<Integer> gid
) {
    public static ThrowCombineInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ThrowCombineInfo(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ThrowCombineInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ThrowCombineInfo(
            Pojos.readIntList(fields, 1)
        );
    }
}
