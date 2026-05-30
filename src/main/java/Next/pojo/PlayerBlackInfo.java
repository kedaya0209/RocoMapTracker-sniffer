// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBlackInfo(
    List<PlayerBlackData> blackList,
    PlayerObserveBattleBlackData observeBattleBlackList
) {
    public static PlayerBlackInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBlackInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBlackData::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerObserveBattleBlackData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static PlayerBlackInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBlackInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerBlackData::parseFrom).toList(),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.PlayerObserveBattleBlackData.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
