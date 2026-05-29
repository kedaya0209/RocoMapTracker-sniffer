// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetEnvEnergyInfo(
    int petId,
    List<EnvEnergyInfo> envInfo
) {
    public static PetEnvEnergyInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetEnvEnergyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.EnvEnergyInfo::parseFrom).toList()
        );
    }
    public static PetEnvEnergyInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetEnvEnergyInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.EnvEnergyInfo::parseFrom).toList()
        );
    }
}
