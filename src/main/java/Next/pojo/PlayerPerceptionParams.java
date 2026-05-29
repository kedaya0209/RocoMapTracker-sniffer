// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerPerceptionParams(
    int petGid
) {
    public static PlayerPerceptionParams parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerPerceptionParams(
            Pojos.readInt(fields, 1)
        );
    }
    public static PlayerPerceptionParams parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerPerceptionParams(
            Pojos.readInt(fields, 1)
        );
    }
}
