// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerAdventureData(
    int openChapter,
    List<Integer> rewardedChapter,
    List<Integer> chapters,
    PlayerAdventureChapterList openChapters
) {
    public static PlayerAdventureData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAdventureData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerAdventureChapterList.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
    public static PlayerAdventureData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAdventureData(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3),
            Pojos.readMessage(fields, 4) != null ? Next.pojo.PlayerAdventureChapterList.parseFrom(Pojos.readMessage(fields, 4)) : null
        );
    }
}
