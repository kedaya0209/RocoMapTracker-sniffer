// Generated from com_goods.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record BagBackpackInfo(
    List<BackpackInfo> ballList,
    List<BackpackInfo> magicList,
    int ballMaxSize,
    int magicMaxSize
) {
    public static BagBackpackInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new BagBackpackInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BackpackInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BackpackInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
    public static BagBackpackInfo parseFrom(java.util.List<ProtoField> fields) {
        return new BagBackpackInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.BackpackInfo::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.BackpackInfo::parseFrom).toList(),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4)
        );
    }
}
