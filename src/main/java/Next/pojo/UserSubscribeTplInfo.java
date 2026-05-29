// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record UserSubscribeTplInfo(
    int tplType,
    String tplId,
    int isSubscribed
) {
    public static UserSubscribeTplInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new UserSubscribeTplInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static UserSubscribeTplInfo parseFrom(java.util.List<ProtoField> fields) {
        return new UserSubscribeTplInfo(
            Pojos.readInt(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
