// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerGiftInfo(
    List<GiftGivingData> giftGivingDatas,
    int checkGivingGiftTimestamp
) {
    public static PlayerGiftInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerGiftInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GiftGivingData::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
    public static PlayerGiftInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerGiftInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GiftGivingData::parseFrom).toList(),
            Pojos.readInt(fields, 2)
        );
    }
}
