// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record LogicStatusExtraData(
    int type,
    LogicStatusLevelPos levelPos,
    LogicStatusOwlFruit owlFruit,
    LogicStatusBeastBattle beastStatus,
    int lastUpdateTime,
    int jellyTargetModelId,
    int transformCfgId,
    int transformEndReason,
    int aiParam,
    LogicStatusWaitOthers waitOthers
) {
    public static LogicStatusExtraData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new LogicStatusExtraData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.LogicStatusLevelPos.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.LogicStatusOwlFruit.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.LogicStatusBeastBattle.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.LogicStatusWaitOthers.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
    public static LogicStatusExtraData parseFrom(java.util.List<ProtoField> fields) {
        return new LogicStatusExtraData(
            Pojos.readInt(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.LogicStatusLevelPos.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readMessage(fields, 3) != null ? Next.pojo.LogicStatusOwlFruit.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readMessage(fields, 4) != null ? Next.pojo.LogicStatusBeastBattle.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6),
            Pojos.readInt(fields, 7),
            Pojos.readInt(fields, 8),
            Pojos.readInt(fields, 9),
            Pojos.readMessage(fields, 10) != null ? Next.pojo.LogicStatusWaitOthers.parseFrom(Pojos.readMessage(fields, 10)) : null
        );
    }
}
