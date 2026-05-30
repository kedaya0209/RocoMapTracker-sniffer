// Generated from space_action.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_AddStoryFlags(
    long actorId,
    int optionId,
    List<Integer> storyFlags,
    long avatarId
) {
    public static SpaceAct_AddStoryFlags parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_AddStoryFlags(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
    public static SpaceAct_AddStoryFlags parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_AddStoryFlags(
            Pojos.readLong(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readLong(fields, 4)
        );
    }
}
