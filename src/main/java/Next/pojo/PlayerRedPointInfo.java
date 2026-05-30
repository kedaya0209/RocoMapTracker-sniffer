// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record PlayerRedPointInfo(
    List<RedPointGroup> groupInfo,
    List<RedPointGroup> cachedGroupInfo
) {
    public static PlayerRedPointInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new PlayerRedPointInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RedPointGroup::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RedPointGroup::parseFrom).toList()
        );
    }
    public static PlayerRedPointInfo parseFrom(java.util.List<ProtoField> fields) {
        return new PlayerRedPointInfo(
            Pojos.readMessageList(fields, 1).stream().map(Next.pojo.RedPointGroup::parseFrom).toList(),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.RedPointGroup::parseFrom).toList()
        );
    }
}
