// Generated from battle_proto.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ZoneBattlePlayerRunawayRsp(
    RetInfo retInfo
) {
    public static ZoneBattlePlayerRunawayRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneBattlePlayerRunawayRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
    public static ZoneBattlePlayerRunawayRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneBattlePlayerRunawayRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null
        );
    }
}
