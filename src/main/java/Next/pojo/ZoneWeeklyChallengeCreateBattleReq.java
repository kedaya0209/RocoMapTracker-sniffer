// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneWeeklyChallengeCreateBattleReq(
    int sourceType,
    int activityId,
    int challengeId,
    Point avatarPt,
    int priorityPetGid
) {
    public static ZoneWeeklyChallengeCreateBattleReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneWeeklyChallengeCreateBattleReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneWeeklyChallengeCreateBattleReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneWeeklyChallengeCreateBattleReq(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5)
        );
    }
}
