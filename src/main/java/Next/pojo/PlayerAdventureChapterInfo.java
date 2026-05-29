// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerAdventureChapterInfo(
    int petId,
    List<Integer> chapters
) {
    public static PlayerAdventureChapterInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAdventureChapterInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
    public static PlayerAdventureChapterInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAdventureChapterInfo(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2)
        );
    }
}
