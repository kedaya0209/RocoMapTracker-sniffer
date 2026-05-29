// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SceneSerializedActsNotify(
    byte[] serializedActs
) {
    public static SceneSerializedActsNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SceneSerializedActsNotify(
            Pojos.readBytes(fields, 1)
        );
    }
    public static SceneSerializedActsNotify parseFrom(java.util.List<ProtoField> fields) {
        return new SceneSerializedActsNotify(
            Pojos.readBytes(fields, 1)
        );
    }
}
