// Generated from env_info.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record EnvInfoCell(
    int z,
    List<Integer> tagList
) {
    public static EnvInfoCell parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new EnvInfoCell(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static EnvInfoCell parseFrom(java.util.List<ProtoField> fields) {
        return new EnvInfoCell(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
