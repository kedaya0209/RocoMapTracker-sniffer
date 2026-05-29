// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record LogicStatusWaitOthers(
    int waitMateUin
) {
    public static LogicStatusWaitOthers parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LogicStatusWaitOthers(
            Pojos.readInt(fields, 1)
        );
    }
    public static LogicStatusWaitOthers parseFrom(java.util.List<ProtoField> fields) {
        return new LogicStatusWaitOthers(
            Pojos.readInt(fields, 1)
        );
    }
}
