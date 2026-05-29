// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PlayPerceptionHud(
    long actorId,
    int hudType,
    long timeStamp,
    boolean isShow,
    long targetActorId,
    SvrAISyncCommonInfo syncCommonInfo,
    long localPlayerObjId,
    int showRange
) {
    public static SpaceAct_PlayPerceptionHud parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PlayPerceptionHud(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
    public static SpaceAct_PlayPerceptionHud parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PlayPerceptionHud(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readLong(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readLong(fields, 7),
            Pojos.readInt(fields, 8)
        );
    }
}
