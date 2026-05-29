// Generated from com_home.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeLayEggCoupleOne(
    long femaleObjId,
    List<Long> maleObjId
) {
    public static HomeLayEggCoupleOne parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeLayEggCoupleOne(
            Pojos.readLong(fields, 1),
            Pojos.readLongList(fields, 2)
        );
    }
    public static HomeLayEggCoupleOne parseFrom(java.util.List<ProtoField> fields) {
        return new HomeLayEggCoupleOne(
            Pojos.readLong(fields, 1),
            Pojos.readLongList(fields, 2)
        );
    }
}
