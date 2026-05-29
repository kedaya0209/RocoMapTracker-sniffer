// Generated from com_pet_medal.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PetMedalTaskInfo(
    int medalConfId,
    List<PetMedalTaskInfo_TaskInfo> taskInfo,
    int medalType
) {
    public static PetMedalTaskInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PetMedalTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetMedalTaskInfo_TaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
    public static PetMedalTaskInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PetMedalTaskInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.PetMedalTaskInfo_TaskInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
}
