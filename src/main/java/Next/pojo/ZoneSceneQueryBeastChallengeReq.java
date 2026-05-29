// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneQueryBeastChallengeReq(
    long npcObjId,
    long npcLogicId
) {
    public static ZoneSceneQueryBeastChallengeReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneQueryBeastChallengeReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static ZoneSceneQueryBeastChallengeReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneQueryBeastChallengeReq(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
