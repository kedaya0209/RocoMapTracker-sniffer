// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerNpcRefreshBanInfo(
    long banTime,
    int banProbability
) {
    public static PlayerNpcRefreshBanInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerNpcRefreshBanInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerNpcRefreshBanInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerNpcRefreshBanInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
