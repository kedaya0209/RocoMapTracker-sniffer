// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerBanItem(
    int permissionDate,
    byte[] reason
) {
    public static PlayerBanItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBanItem(
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
    public static PlayerBanItem parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBanItem(
            Pojos.readInt(fields, 2),
            Pojos.readBytes(fields, 3)
        );
    }
}
