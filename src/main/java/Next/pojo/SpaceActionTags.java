// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record SpaceActionTags(
    SpaceActionTag_Battle battleTag,
    SpaceActionTag_Actor actorTag
) {
    public static SpaceActionTags parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceActionTags(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SpaceActionTag_Battle.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceActionTag_Actor.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
    public static SpaceActionTags parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceActionTags(
            Pojos.readMessage(fields, 1) != null ? Next.pojo.SpaceActionTag_Battle.parseFrom(Pojos.readMessage(fields, 1)) : null,
            Pojos.readMessage(fields, 2) != null ? Next.pojo.SpaceActionTag_Actor.parseFrom(Pojos.readMessage(fields, 2)) : null
        );
    }
}
