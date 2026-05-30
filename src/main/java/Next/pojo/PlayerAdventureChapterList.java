// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerAdventureChapterList(
    List<PlayerAdventureChapterInfo> openChapterList
) {
    public static PlayerAdventureChapterList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerAdventureChapterList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerAdventureChapterInfo::parseFrom).toList()
        );
    }
    public static PlayerAdventureChapterList parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerAdventureChapterList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.PlayerAdventureChapterInfo::parseFrom).toList()
        );
    }
}
