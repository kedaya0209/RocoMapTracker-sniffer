// Generated from com_pet.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetTaskInfo(
    List<PetTogetherTaskInfo> togetherTask
) {
    public static PetTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetTaskInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetTogetherTaskInfo::parseFrom).toList()
        );
    }
    public static PetTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetTaskInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PetTogetherTaskInfo::parseFrom).toList()
        );
    }
}
