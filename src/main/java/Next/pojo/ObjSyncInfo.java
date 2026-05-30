// Generated from com_misc.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ObjSyncInfo(
    long id,
    int syncId,
    byte[] data
) {
    public static ObjSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ObjSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
    public static ObjSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ObjSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
}
