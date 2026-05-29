// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerShareInfo(
    List<PlayerShareRewardInfo> rewardGroups
) {
    public static PlayerShareInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerShareInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerShareRewardInfo::parseFrom).toList()
        );
    }
    public static PlayerShareInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerShareInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerShareRewardInfo::parseFrom).toList()
        );
    }
}
