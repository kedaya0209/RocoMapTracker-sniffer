// Generated from com_activity.proto
package Next.pojo;

import io.github.kedaya0209.roco.sniffer.codec.Pojos;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser.ProtoField;
import io.github.kedaya0209.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record ClimbChapterItem(
    int chapterId,
    int nowFinishStage
) {
    public static ClimbChapterItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ClimbChapterItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
    public static ClimbChapterItem parseFrom(java.util.List<ProtoField> fields) {
        return new ClimbChapterItem(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2)
        );
    }
}
