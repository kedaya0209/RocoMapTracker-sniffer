// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneFashionSuitsLevelUpReq(
    int fashionSuitId,
    int level,
    List<Integer> components
) {
    public static ZoneFashionSuitsLevelUpReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneFashionSuitsLevelUpReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 5)
        );
    }
    public static ZoneFashionSuitsLevelUpReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneFashionSuitsLevelUpReq(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 5)
        );
    }
}
