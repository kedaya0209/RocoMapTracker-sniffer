// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetClosenessHistoryInfo(
    int closenessLv,
    long lvTimestamp
) {
    public static PetClosenessHistoryInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetClosenessHistoryInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
    public static PetClosenessHistoryInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetClosenessHistoryInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2)
        );
    }
}
