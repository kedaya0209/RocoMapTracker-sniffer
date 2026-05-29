// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZoneQueryPetBalancedAttrRsp(
    RetInfo retInfo,
    List<PetData> petData
) {
    public static ZoneQueryPetBalancedAttrRsp parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZoneQueryPetBalancedAttrRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetData::parseFrom).toList()
        );
    }
    public static ZoneQueryPetBalancedAttrRsp parseFrom(java.util.List<ProtoField> fields) {
        return new ZoneQueryPetBalancedAttrRsp(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.RetInfo.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetData::parseFrom).toList()
        );
    }
}
