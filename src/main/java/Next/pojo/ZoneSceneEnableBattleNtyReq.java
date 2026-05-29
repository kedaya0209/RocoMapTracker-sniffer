// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneSceneEnableBattleNtyReq(
    long actorId,
    boolean enableBattle
) {
    public static ZoneSceneEnableBattleNtyReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneSceneEnableBattleNtyReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ZoneSceneEnableBattleNtyReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneSceneEnableBattleNtyReq(
            Pojos.readLong(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
