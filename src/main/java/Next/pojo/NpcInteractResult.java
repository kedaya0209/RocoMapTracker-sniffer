// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record NpcInteractResult(
    int optionId,
    List<InteractActionResult> actionResults,
    List<BeginActResult> beginActResults,
    boolean isOptionFinished,
    int trigInteractType,
    int npcContentCfgId,
    int petInteractId,
    List<Integer> throwPetGids,
    int npcBelongPetGid
) {
    public static NpcInteractResult parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcInteractResult(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.InteractActionResult::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BeginActResult::parseFrom).toList(),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
    public static NpcInteractResult parseFrom(java.util.List<ProtoField> fields) {
        return new NpcInteractResult(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.InteractActionResult::parseFrom).toList(),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.BeginActResult::parseFrom).toList(),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readIntList(fields, 9),
            Pojos.readInt(fields, 10)
        );
    }
}
