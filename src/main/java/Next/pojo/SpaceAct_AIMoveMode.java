// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_AIMoveMode(
    long actorId,
    ActorInfo_AIMoveMode moveMode
) {
    public static SpaceAct_AIMoveMode parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_AIMoveMode(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_AIMoveMode.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_AIMoveMode parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_AIMoveMode(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_AIMoveMode.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
