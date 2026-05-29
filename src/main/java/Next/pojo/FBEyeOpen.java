// Generated from client.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record FBEyeOpen(
    long IsOpen
) {
    public static FBEyeOpen parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new FBEyeOpen(
            Pojos.readLong(fields, 1)
        );
    }
    public static FBEyeOpen parseFrom(java.util.List<ProtoField> fields) {
        return new FBEyeOpen(
            Pojos.readLong(fields, 1)
        );
    }
}
