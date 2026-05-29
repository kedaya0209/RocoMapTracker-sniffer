// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetDataInfoList(
    List<PetData> petData
) {
    public static PetDataInfoList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetDataInfoList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetData::parseFrom).toList()
        );
    }
    public static PetDataInfoList parseFrom(java.util.List<ProtoField> fields) {
        return new PetDataInfoList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetData::parseFrom).toList()
        );
    }
}
