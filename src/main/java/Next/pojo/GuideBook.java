// Generated from com_player.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GuideBook(
    int id,
    List<StampInfo> stamps,
    int unlockedAt
) {
    public static GuideBook parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GuideBook(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.StampInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
    public static GuideBook parseFrom(java.util.List<ProtoField> fields) {
        return new GuideBook(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.StampInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3)
        );
    }
}
