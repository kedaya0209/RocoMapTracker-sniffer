// Generated from com_actor.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record NpcTraceInfo(
    int contentId,
    long npcObjId,
    long npcLogicId,
    Point pt,
    int petBaseId,
    int npcCfgId
) {
    public static NpcTraceInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new NpcTraceInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static NpcTraceInfo parseFrom(java.util.List<ProtoField> fields) {
        return new NpcTraceInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readLong(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
