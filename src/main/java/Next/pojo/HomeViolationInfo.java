// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomeViolationInfo(
    boolean isViolation,
    int beginTime
) {
    public static HomeViolationInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeViolationInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static HomeViolationInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeViolationInfo(
            Pojos.readBool(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
