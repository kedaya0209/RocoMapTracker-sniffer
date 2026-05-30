// Generated from com_story_flag.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerStoryFlagInfo(
    int version,
    List<Integer> storyFlags,
    List<Integer> cachedStoryFlags
) {
    public static PlayerStoryFlagInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerStoryFlagInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static PlayerStoryFlagInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerStoryFlagInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
