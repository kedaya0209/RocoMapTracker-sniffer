// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorTravelingMerchantData(
    int id,
    List<Integer> contentId,
    long refreshTime,
    long expireTime
) {
    public static ActorTravelingMerchantData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorTravelingMerchantData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static ActorTravelingMerchantData parseFrom(java.util.List<ProtoField> fields) {
        return new ActorTravelingMerchantData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
