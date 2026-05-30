// Generated from com_avatar.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record VisiblePlanInfo(
    int areaId,
    long planId,
    List<VisibleAvatarInfo> avatarList
) {
    public static VisiblePlanInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisiblePlanInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.VisibleAvatarInfo::parseFrom).toList()
        );
    }
    public static VisiblePlanInfo parseFrom(java.util.List<ProtoField> fields) {
        return new VisiblePlanInfo(
            Pojos.readInt(fields, 1),
            Pojos.readLong(fields, 2),
            Pojos.readMessageList(fields, 3).stream().map(Next.pojo.VisibleAvatarInfo::parseFrom).toList()
        );
    }
}
