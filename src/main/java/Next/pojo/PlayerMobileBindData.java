// Generated from com_player_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerMobileBindData(
    String mobileNum,
    int smsCodeTime,
    String smsRequestId,
    int rewardTime,
    String authToken
) {
    public static PlayerMobileBindData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerMobileBindData(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5)
        );
    }
    public static PlayerMobileBindData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerMobileBindData(
            Pojos.readString(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readString(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readString(fields, 5)
        );
    }
}
