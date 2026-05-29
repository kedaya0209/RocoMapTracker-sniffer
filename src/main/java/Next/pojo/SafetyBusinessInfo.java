// Generated from com_account.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SafetyBusinessInfo(
    int reportCategory,
    List<Integer> reportReason,
    int reportScene,
    String reportedProfileUrl,
    String reportBattleId,
    int reportBattleTime,
    String reportDesc,
    String reportContent,
    List<String> picUrlArray,
    List<String> videoUrlArray,
    List<String> voiceUrlArray,
    String reportGroupId,
    String reportGroupName,
    int languageId,
    String callback,
    SafetyContentID contentId,
    int reportEntrance
) {
    public static SafetyBusinessInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SafetyBusinessInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readString(fields, 8),
            Pojos.readStringList(fields, 9),
            Pojos.readStringList(fields, 10),
            Pojos.readStringList(fields, 11),
            Pojos.readString(fields, 12),
            Pojos.readString(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readString(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.SafetyContentID.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readInt(fields, 17)
        );
    }
    public static SafetyBusinessInfo parseFrom(java.util.List<ProtoField> fields) {
        return new SafetyBusinessInfo(
            Pojos.readInt(fields, 1, 0),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readString(fields, 4),
            Pojos.readString(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readString(fields, 7),
            Pojos.readString(fields, 8),
            Pojos.readStringList(fields, 9),
            Pojos.readStringList(fields, 10),
            Pojos.readStringList(fields, 11),
            Pojos.readString(fields, 12),
            Pojos.readString(fields, 13),
            Pojos.readInt(fields, 14),
            Pojos.readString(fields, 15),
            Pojos.readMessage(fields, 16) != null ? Next.pojo.SafetyContentID.parseFrom(Pojos.readMessage(fields, 16)) : null,
            Pojos.readInt(fields, 17)
        );
    }
}
