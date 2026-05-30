// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetActionSyncInfo(
    long operationTargetId,
    int operationType,
    long operatorOwnerId,
    int actionStatus,
    int optionId,
    int confType,
    int confId
) {
    public static PetActionSyncInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetActionSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6, 0),
            Pojos.readInt(fields, 7)
        );
    }
    public static PetActionSyncInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetActionSyncInfo(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6, 0),
            Pojos.readInt(fields, 7)
        );
    }
}
