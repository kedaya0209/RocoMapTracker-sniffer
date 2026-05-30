// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceAct_PropertyTypeChange(
    long actorId,
    ActorInfo_PropertyType propertyTypeInfo
) {
    public static SpaceAct_PropertyTypeChange parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_PropertyTypeChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_PropertyType.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceAct_PropertyTypeChange parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_PropertyTypeChange(
            Pojos.readLong(fields, 1),
            Pojos.readMessage(fields, 2) != null ? Next.pojo.ActorInfo_PropertyType.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
