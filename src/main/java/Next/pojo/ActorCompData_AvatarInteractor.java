// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorCompData_AvatarInteractor(
    long interactNpcId,
    long interactNpcLogicId,
    boolean isInteractAsVisitor,
    long sitNpcId,
    int sitSeatIdx,
    NpcInteractResult interactResult
) {
    public static ActorCompData_AvatarInteractor parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_AvatarInteractor(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 5),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.NpcInteractResult.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
    public static ActorCompData_AvatarInteractor parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_AvatarInteractor(
            Pojos.readLong(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readBool(fields, 5),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessage(fields, 6) != null ? Next.pojo.NpcInteractResult.parseFrom(Pojos.readMessage(fields, 6)) : null
        );
    }
}
