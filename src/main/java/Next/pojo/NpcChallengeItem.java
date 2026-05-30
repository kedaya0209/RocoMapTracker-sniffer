// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcChallengeItem(
    int id,
    List<BattleFieldItem> battleFieldItems
) {
    public static NpcChallengeItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcChallengeItem(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleFieldItem::parseFrom).toList()
        );
    }
    public static NpcChallengeItem parseFrom(java.util.List<ProtoField> fields) {
        return new NpcChallengeItem(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleFieldItem::parseFrom).toList()
        );
    }
}
