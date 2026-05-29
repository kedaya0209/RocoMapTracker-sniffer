// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_Minigame(
    PlayingMinigameData minigameData,
    MinigameTriggerData lastMinigameTrigger,
    List<Integer> openedMinigameCfgIds
) {
    public static ActorCompData_Minigame parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_Minigame(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayingMinigameData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MinigameTriggerData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 5)
        );
    }
    public static ActorCompData_Minigame parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_Minigame(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.PlayingMinigameData.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.MinigameTriggerData.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readIntList(fields, 5)
        );
    }
}
