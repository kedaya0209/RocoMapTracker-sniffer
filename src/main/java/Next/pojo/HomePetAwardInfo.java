// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomePetAwardInfo(
    List<HomePetGoodsInfo> goodsInfos
) {
    public static HomePetAwardInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomePetAwardInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HomePetGoodsInfo::parseFrom).toList()
        );
    }
    public static HomePetAwardInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomePetAwardInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HomePetGoodsInfo::parseFrom).toList()
        );
    }
}
