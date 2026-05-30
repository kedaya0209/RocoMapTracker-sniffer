// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerWorldMapInfo(
    List<GuideBook> guideBooks
) {
    public static PlayerWorldMapInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerWorldMapInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GuideBook::parseFrom).toList()
        );
    }
    public static PlayerWorldMapInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerWorldMapInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.GuideBook::parseFrom).toList()
        );
    }
}
