// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_MinigameNotify(
    int status,
    int minigameCfgId,
    List<MinigameProgress> progress,
    int remainTime,
    long triggerNpcObjId
) {
    public static SpaceAct_MinigameNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_MinigameNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.MinigameProgress::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
    public static SpaceAct_MinigameNotify parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_MinigameNotify(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.MinigameProgress::parseFrom).toList(),
            Pojos.readInt(fields, 4),
            Pojos.readLong(fields, 5)
        );
    }
}
