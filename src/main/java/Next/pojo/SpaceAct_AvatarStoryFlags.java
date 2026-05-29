// Generated from space_action.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record SpaceAct_AvatarStoryFlags(
    List<Integer> storyFlags,
    List<Integer> visitOwnerStoryFlags
) {
    public static SpaceAct_AvatarStoryFlags parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new SpaceAct_AvatarStoryFlags(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static SpaceAct_AvatarStoryFlags parseFrom(java.util.List<ProtoField> fields) {
        return new SpaceAct_AvatarStoryFlags(
            Pojos.readIntList(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
