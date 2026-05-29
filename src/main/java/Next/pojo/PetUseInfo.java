// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetUseInfo(
    int petBaseCfgId,
    int useTimes
) {
    public static PetUseInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetUseInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PetUseInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetUseInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
