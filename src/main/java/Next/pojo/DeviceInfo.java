// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record DeviceInfo(
    String device,
    String lodLevel,
    String ext,
    int screenScale,
    int fps,
    int forbid
) {
    public static DeviceInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new DeviceInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static DeviceInfo parseFrom(java.util.List<ProtoField> fields) {
        return new DeviceInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
