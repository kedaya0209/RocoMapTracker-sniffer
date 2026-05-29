// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeLayEggCoupleInfo(
    List<HomeLayEggCoupleOne> femaleCouple
) {
    public static HomeLayEggCoupleInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeLayEggCoupleInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HomeLayEggCoupleOne::parseFrom).toList()
        );
    }
    public static HomeLayEggCoupleInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HomeLayEggCoupleInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.HomeLayEggCoupleOne::parseFrom).toList()
        );
    }
}
