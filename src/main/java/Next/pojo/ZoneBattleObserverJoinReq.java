// Generated from battle_proto.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleObserverJoinReq(
    int battlerUin
) {
    public static ZoneBattleObserverJoinReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleObserverJoinReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneBattleObserverJoinReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleObserverJoinReq(
            Pojos.readInt(fields, 1)
        );
    }
}
