// Generated from home_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HomeBasicSyncData(
    boolean isOwnerOnline,
    byte[] homeName
) {
    public static HomeBasicSyncData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeBasicSyncData(
            Pojos.readBool(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
    public static HomeBasicSyncData parseFrom(java.util.List<ProtoField> fields) {
        return new HomeBasicSyncData(
            Pojos.readBool(fields, 1),
            Pojos.readBytes(fields, 2)
        );
    }
}
