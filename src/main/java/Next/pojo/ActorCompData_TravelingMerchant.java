// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_TravelingMerchant(
    List<ActorTravelingMerchantData> merchants
) {
    public static ActorCompData_TravelingMerchant parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_TravelingMerchant(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorTravelingMerchantData::parseFrom).toList()
        );
    }
    public static ActorCompData_TravelingMerchant parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_TravelingMerchant(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ActorTravelingMerchantData::parseFrom).toList()
        );
    }
}
