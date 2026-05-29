// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBehaviorStatusExtraParams(
    boolean hasRoleplayBehavior
) {
    public static PlayerBehaviorStatusExtraParams parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBehaviorStatusExtraParams(
            Pojos.readBool(fields, 1)
        );
    }
    public static PlayerBehaviorStatusExtraParams parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBehaviorStatusExtraParams(
            Pojos.readBool(fields, 1)
        );
    }
}
