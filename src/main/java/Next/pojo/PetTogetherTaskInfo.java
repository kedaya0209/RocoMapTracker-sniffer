// Generated from com_pet.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetTogetherTaskInfo(
    int gid,
    int taskId,
    boolean isInTaskArea
) {
    public static PetTogetherTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetTogetherTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
    public static PetTogetherTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetTogetherTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3)
        );
    }
}
