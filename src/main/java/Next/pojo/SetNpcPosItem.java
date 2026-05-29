// Generated from com_actor.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SetNpcPosItem(
    long npcId,
    Point pt,
    long npcLogicId,
    int opType
) {
    public static SetNpcPosItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SetNpcPosItem(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
    public static SetNpcPosItem parseFrom(java.util.List<ProtoField> fields) {
        return new SetNpcPosItem(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.Point.parseFrom(Pojos.readMessage(fields, 2)) : null,
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4, 0)
        );
    }
}
