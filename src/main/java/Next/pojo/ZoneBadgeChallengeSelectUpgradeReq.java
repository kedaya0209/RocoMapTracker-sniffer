// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneBadgeChallengeSelectUpgradeReq(
    List<Integer> index
) {
    public static ZoneBadgeChallengeSelectUpgradeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBadgeChallengeSelectUpgradeReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneBadgeChallengeSelectUpgradeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBadgeChallengeSelectUpgradeReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
