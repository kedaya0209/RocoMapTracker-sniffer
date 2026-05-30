// Generated from com_home.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record HomeUnlockedHandBookList(
    List<FurnitureHandBook> unlockList
) {
    public static HomeUnlockedHandBookList parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HomeUnlockedHandBookList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FurnitureHandBook::parseFrom).toList()
        );
    }
    public static HomeUnlockedHandBookList parseFrom(java.util.List<ProtoField> fields) {
        return new HomeUnlockedHandBookList(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.FurnitureHandBook::parseFrom).toList()
        );
    }
}
