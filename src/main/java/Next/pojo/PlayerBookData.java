// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerBookData(
    List<BookData> bookData
) {
    public static PlayerBookData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerBookData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BookData::parseFrom).toList()
        );
    }
    public static PlayerBookData parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerBookData(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BookData::parseFrom).toList()
        );
    }
}
