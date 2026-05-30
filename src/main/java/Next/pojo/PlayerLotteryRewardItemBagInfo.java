// Generated from com_player_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerLotteryRewardItemBagInfo(
    PlayerLotteryRewardConfirmBagInfo lotteryConfirm
) {
    public static PlayerLotteryRewardItemBagInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerLotteryRewardItemBagInfo(
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerLotteryRewardConfirmBagInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
    public static PlayerLotteryRewardItemBagInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerLotteryRewardItemBagInfo(
            Pojos.readMessage(fields, 3) != null ? Next.pojo.PlayerLotteryRewardConfirmBagInfo.parseFrom(Pojos.readMessage(fields, 3)) : null
        );
    }
}
