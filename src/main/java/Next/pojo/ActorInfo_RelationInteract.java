// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ActorInfo_RelationInteract(
    int type,
    int subType,
    int status,
    InteractParam param,
    int uin1p,
    int uin2p
) {
    public static ActorInfo_RelationInteract parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorInfo_RelationInteract(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
    public static ActorInfo_RelationInteract parseFrom(java.util.List<ProtoField> fields) {
        return new ActorInfo_RelationInteract(
            Pojos.readInt(fields, 1, 0),
            Pojos.readInt(fields, 2, 0),
            Pojos.readInt(fields, 3, 0),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.InteractParam.parseFrom(Pojos.readMessage(fields, 4)) : null,
            Pojos.readInt(fields, 5),
            Pojos.readInt(fields, 6)
        );
    }
}
