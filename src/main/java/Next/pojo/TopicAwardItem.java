// Generated from zonesvr.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record TopicAwardItem(
    int hbId,
    List<Integer> rewardIdxs,
    List<Integer> topicIds
) {
    public static TopicAwardItem parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new TopicAwardItem(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
    public static TopicAwardItem parseFrom(java.util.List<ProtoField> fields) {
        return new TopicAwardItem(
            Pojos.readInt(fields, 1),
            Pojos.readIntList(fields, 2),
            Pojos.readIntList(fields, 3)
        );
    }
}
