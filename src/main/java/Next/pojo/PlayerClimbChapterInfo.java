// Generated from com_activity.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerClimbChapterInfo(
    List<ClimbChapterItem> chapterList
) {
    public static PlayerClimbChapterInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerClimbChapterInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ClimbChapterItem::parseFrom).toList()
        );
    }
    public static PlayerClimbChapterInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerClimbChapterInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.ClimbChapterItem::parseFrom).toList()
        );
    }
}
