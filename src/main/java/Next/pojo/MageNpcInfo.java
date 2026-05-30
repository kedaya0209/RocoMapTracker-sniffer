// Generated from com_magebook.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record MageNpcInfo(
    int id,
    List<MageNpcItem> items,
    boolean unlocked,
    boolean disabledInCamp,
    int assistTimes
) {
    public static MageNpcInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new MageNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MageNpcItem::parseFrom).toList(),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
    public static MageNpcInfo parseFrom(java.util.List<ProtoField> fields) {
        return new MageNpcInfo(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.MageNpcItem::parseFrom).toList(),
            Pojos.readBool(fields, 3),
            Pojos.readBool(fields, 4),
            Pojos.readInt(fields, 5)
        );
    }
}
