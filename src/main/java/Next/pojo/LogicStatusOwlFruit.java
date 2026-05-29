// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record LogicStatusOwlFruit(
    int num
) {
    public static LogicStatusOwlFruit parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LogicStatusOwlFruit(
            Pojos.readInt(fields, 1)
        );
    }
    public static LogicStatusOwlFruit parseFrom(java.util.List<ProtoField> fields) {
        return new LogicStatusOwlFruit(
            Pojos.readInt(fields, 1)
        );
    }
}
