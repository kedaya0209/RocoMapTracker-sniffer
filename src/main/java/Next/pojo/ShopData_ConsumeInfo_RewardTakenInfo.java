// Generated from com_shop.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ShopData_ConsumeInfo_RewardTakenInfo(
    int level,
    boolean isRewardTaken
) {
    public static ShopData_ConsumeInfo_RewardTakenInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ShopData_ConsumeInfo_RewardTakenInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
    public static ShopData_ConsumeInfo_RewardTakenInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ShopData_ConsumeInfo_RewardTakenInfo(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2)
        );
    }
}
