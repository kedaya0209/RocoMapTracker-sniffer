// Generated from zonesvr.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneChallengeCreateBattleReq(
    SourceData sourceData,
    Point avatarPt,
    boolean useBigWorldTeam,
    int dungeonId,
    int priorityPetGid
) {
    public static ZoneChallengeCreateBattleReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneChallengeCreateBattleReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SourceData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static ZoneChallengeCreateBattleReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneChallengeCreateBattleReq(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SourceData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
