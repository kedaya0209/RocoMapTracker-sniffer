// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SnsAuthInfo(
    String openid,
    String accessToken,
    int cliLoginChannel,
    int worldId
) {
    public static SnsAuthInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SnsAuthInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static SnsAuthInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SnsAuthInfo(
            Pojos.readString(fields, 1),
            Pojos.readString(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
