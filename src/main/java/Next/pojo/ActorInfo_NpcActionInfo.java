// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorInfo_NpcActionInfo(
    int actType,
    int actStatus,
    boolean actExecSuccess,
    int boundDialogId,
    int btleCfgId,
    int actResultType,
    int dialogId,
    int campPetReportId,
    int nextDialogId,
    List<ActorInfo_NpcDialogSelectInfo> selectInfos,
    List<Integer> beginActParams,
    int dialogSkipState,
    List<Integer> handOverItemConfId
) {
    public static ActorInfo_NpcActionInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_NpcActionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.ActorInfo_NpcDialogSelectInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readIntList(fields, 13)
        );
    }
    public static ActorInfo_NpcActionInfo parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_NpcActionInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readBool(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessageList(fields, 10).stream().map(Next.pojo.ActorInfo_NpcDialogSelectInfo::parseFrom).toList(),
            Pojos.readIntList(fields, 11),
            Pojos.readInt(fields, 12),
            Pojos.readIntList(fields, 13)
        );
    }
}
