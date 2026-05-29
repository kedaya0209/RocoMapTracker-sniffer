// Generated from com_shop.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ShopData_ConsumeInfo(
    int totalConsumeNum,
    List<ShopData_ConsumeInfo_RewardTakenInfo> rewardTakenInfo
) {
    public static ShopData_ConsumeInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ShopData_ConsumeInfo(
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ShopData_ConsumeInfo_RewardTakenInfo::parseFrom).toList()
        );
    }
    public static ShopData_ConsumeInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ShopData_ConsumeInfo(
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.ShopData_ConsumeInfo_RewardTakenInfo::parseFrom).toList()
        );
    }
}
