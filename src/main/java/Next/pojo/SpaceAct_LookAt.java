// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_LookAt(
    long actorId,
    long targetActorId,
    Position targetPos,
    boolean enable,
    boolean immediately,
    SvrAISyncCommonInfo syncCommonInfo,
    boolean atCamera
) {
    public static SpaceAct_LookAt parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_LookAt(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readBool(fields, 7)
        );
    }
    public static SpaceAct_LookAt parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_LookAt(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessage(fields, 3) != null ? Next.pojo.Position.parseFrom(Pojos.readMessage(fields, 3)) : null,
            Pojos.readBool(fields, 4),
            Pojos.readBool(fields, 5),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.SvrAISyncCommonInfo.parseFrom(Pojos.readMessage(fields, 6)) : null,
            Pojos.readBool(fields, 7)
        );
    }
}
