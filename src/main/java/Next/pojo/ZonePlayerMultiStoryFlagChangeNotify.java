// Generated from story_flag.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ZonePlayerMultiStoryFlagChangeNotify(
    int changeType,
    List<Integer> changeVal,
    int version
) {
    public static ZonePlayerMultiStoryFlagChangeNotify parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ZonePlayerMultiStoryFlagChangeNotify(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
    public static ZonePlayerMultiStoryFlagChangeNotify parseFrom(java.util.List<ProtoField> fields) {
        return new ZonePlayerMultiStoryFlagChangeNotify(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readInt(fields, 3)
        );
    }
}
