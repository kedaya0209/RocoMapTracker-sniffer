// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record LogicStatusData(
    int status,
    byte[] variant,
    LogicStatusExtraData extraData
) {
    public static LogicStatusData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LogicStatusData(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.LogicStatusExtraData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static LogicStatusData parseFrom(java.util.List<ProtoField> fields) {
        return new LogicStatusData(
            Pojos.readInt(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.LogicStatusExtraData.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
