// Generated from battle_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BattlefieldBuffList(
    List<BattleBuffInfo> buffs,
    int side,
    int pos,
    int uin
) {
    public static BattlefieldBuffList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BattlefieldBuffList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BattleBuffInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static BattlefieldBuffList parseFrom(java.util.List<ProtoField> fields) {
        return new BattlefieldBuffList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BattleBuffInfo::parseFrom).toList(),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
