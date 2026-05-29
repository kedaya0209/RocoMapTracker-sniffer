// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_RelationInteract(
    boolean isInviter,
    int type,
    int status,
    InteractParam param,
    int mateUin,
    boolean isFriend,
    long beginInteractTime,
    int subType,
    int recoverMateUin,
    boolean enteringOnlineVisit
) {
    public static ActorCompData_RelationInteract parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_RelationInteract(
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readInt(fields, 12, 0),
            Pojos.readInt(fields, 100),
            Pojos.readBool(fields, 101)
        );
    }
    public static ActorCompData_RelationInteract parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_RelationInteract(
            Pojos.readBool(fields, 2),
            Pojos.readInt(fields, 3, 0),
            Pojos.readInt(fields, 4, 0),
            Pojos.readMessage(fields, 5) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 5)) : null,
            Pojos.readInt(fields, 6),
            Pojos.readBool(fields, 10),
            Pojos.readLong(fields, 11),
            Pojos.readInt(fields, 12, 0),
            Pojos.readInt(fields, 100),
            Pojos.readBool(fields, 101)
        );
    }
}
