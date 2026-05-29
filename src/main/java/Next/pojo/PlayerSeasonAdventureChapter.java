// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record PlayerSeasonAdventureChapter(
    int chapterId,
    int status,
    int normalProgress,
    int challengeProgress
) {
    public static PlayerSeasonAdventureChapter parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerSeasonAdventureChapter(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static PlayerSeasonAdventureChapter parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerSeasonAdventureChapter(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
