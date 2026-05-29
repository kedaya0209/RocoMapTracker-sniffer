// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneGetCampFruitNpcInfosReq(
    List<Integer> campContentIds
) {
    public static ZoneGetCampFruitNpcInfosReq parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneGetCampFruitNpcInfosReq(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ZoneGetCampFruitNpcInfosReq parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneGetCampFruitNpcInfosReq(
            Pojos.readIntList(fields, 1)
        );
    }
}
