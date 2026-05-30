// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record CatchPetSyncInfo(
    long petId,
    int shakeTimes,
    boolean success,
    boolean useTechnique
) {
    public static CatchPetSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new CatchPetSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
    public static CatchPetSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new CatchPetSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4)
        );
    }
}
