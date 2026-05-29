// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerActivityInfo_ChallengePetUseRate(
    int petBaseId,
    int useRate
) {
    public static PlayerActivityInfo_ChallengePetUseRate parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerActivityInfo_ChallengePetUseRate(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerActivityInfo_ChallengePetUseRate parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerActivityInfo_ChallengePetUseRate(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
