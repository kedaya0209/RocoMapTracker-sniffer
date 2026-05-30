// Generated from com_pet_medal.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetMedalOwnerTaskInfo(
    int taskId,
    int taskCompleteCnt
) {
    public static PetMedalOwnerTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalOwnerTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static PetMedalOwnerTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalOwnerTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
