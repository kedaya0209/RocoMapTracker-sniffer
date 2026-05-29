// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerObserveBattleBlackData(
    long battleId,
    List<PlayerBlackData> blackList
) {
    public static PlayerObserveBattleBlackData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerObserveBattleBlackData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerBlackData::parseFrom).toList()
        );
    }
    public static PlayerObserveBattleBlackData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerObserveBattleBlackData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PlayerBlackData::parseFrom).toList()
        );
    }
}
