// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_Buffs(
    List<ActorInfo_Buff> buffInfos,
    List<BattleBuffBrefInfo> battleBuffInfos
) {
    public static ActorInfo_Buffs parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_Buffs(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo_Buff::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList()
        );
    }
    public static ActorInfo_Buffs parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_Buffs(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorInfo_Buff::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BattleBuffBrefInfo::parseFrom).toList()
        );
    }
}
