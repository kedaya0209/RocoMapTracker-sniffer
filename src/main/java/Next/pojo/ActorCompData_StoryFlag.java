// Generated from space_data.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActorCompData_StoryFlag(
    List<Integer> storyFlags
) {
    public static ActorCompData_StoryFlag parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActorCompData_StoryFlag(
            Pojos.readIntList(fields, 1)
        );
    }
    public static ActorCompData_StoryFlag parseFrom(java.util.List<ProtoField> fields) {
        return new ActorCompData_StoryFlag(
            Pojos.readIntList(fields, 1)
        );
    }
}
