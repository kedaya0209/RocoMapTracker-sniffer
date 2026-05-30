// Generated from com_player_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerLotteryRewardConfirmBagInfo(
    List<PlayerLotteryRewardConfirmItem> itemList
) {
    public static PlayerLotteryRewardConfirmBagInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerLotteryRewardConfirmBagInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerLotteryRewardConfirmItem::parseFrom).toList()
        );
    }
    public static PlayerLotteryRewardConfirmBagInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerLotteryRewardConfirmBagInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerLotteryRewardConfirmItem::parseFrom).toList()
        );
    }
}
