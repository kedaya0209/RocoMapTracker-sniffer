// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record TopMasterInfo(
    int type,
    int prevType,
    int nextType
) {
    public static TopMasterInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TopMasterInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0)
        );
    }
    public static TopMasterInfo parseFrom(java.util.List<ProtoField> fields) {
        return new TopMasterInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0)
        );
    }
}
