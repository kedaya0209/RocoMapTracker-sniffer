// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClientRemoteStorageData(
    String key,
    byte[] value,
    long expireTime,
    long createTime
) {
    public static ClientRemoteStorageData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClientRemoteStorageData(
            Pojos.readString(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static ClientRemoteStorageData parseFrom(java.util.List<ProtoField> fields) {
        return new ClientRemoteStorageData(
            Pojos.readString(fields, 1),
            Pojos.readBytes(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
