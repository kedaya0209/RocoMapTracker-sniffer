// Generated from com_pet_medal.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PetMedalTaskInfo_TaskInfo(
    int taskCompleteCnt,
    int medalGid,
    int ownerId,
    PetMedalExt medalExt
) {
    public static PetMedalTaskInfo_TaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalTaskInfo_TaskInfo(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static PetMedalTaskInfo_TaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalTaskInfo_TaskInfo(
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.PetMedalExt.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
