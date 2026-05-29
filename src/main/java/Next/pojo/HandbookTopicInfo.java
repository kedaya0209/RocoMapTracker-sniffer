// Generated from com_handbook.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;

@SuppressWarnings("unused")
public record HandbookTopicInfo(
    int finishCnt,
    int nodeNum,
    int topicType,
    int topicIdx,
    int topicId,
    boolean getAward
) {
    public static HandbookTopicInfo parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new HandbookTopicInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
    public static HandbookTopicInfo parseFrom(java.util.List<ProtoField> fields) {
        return new HandbookTopicInfo(
            Pojos.readInt(fields, 1),
            Pojos.readInt(fields, 2),
            Pojos.readInt(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readInt(fields, 5),
            Pojos.readBool(fields, 6)
        );
    }
}
