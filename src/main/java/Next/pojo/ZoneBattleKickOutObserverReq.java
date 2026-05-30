// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattleKickOutObserverReq(
    int uin
) {
    public static ZoneBattleKickOutObserverReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattleKickOutObserverReq(
            Pojos.readInt(fields, 1)
        );
    }
    public static ZoneBattleKickOutObserverReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattleKickOutObserverReq(
            Pojos.readInt(fields, 1)
        );
    }
}
