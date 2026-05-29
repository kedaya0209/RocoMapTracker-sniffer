// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_MfbtDebug(
    long actorId,
    List<SpaceAct_MfbtDebug_SpaceAct_MfbtDebug_InnerEventData> eventDatas
) {
    public static SpaceAct_MfbtDebug parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_MfbtDebug(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SpaceAct_MfbtDebug_SpaceAct_MfbtDebug_InnerEventData::parseFrom).toList()
        );
    }
    public static SpaceAct_MfbtDebug parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_MfbtDebug(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.SpaceAct_MfbtDebug_SpaceAct_MfbtDebug_InnerEventData::parseFrom).toList()
        );
    }
}
