// Generated from com_player.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record GuideGroup(
    int groupId,
    boolean finishAll,
    List<Integer> finishIndex
) {
    public static GuideGroup parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new GuideGroup(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static GuideGroup parseFrom(java.util.List<ProtoField> fields) {
        return new GuideGroup(
            Pojos.readInt(fields, 1),
            Pojos.readBool(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
