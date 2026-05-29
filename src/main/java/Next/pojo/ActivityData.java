// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record ActivityData(
    int activityId,
    List<ActivityPartData> partDatas
) {
    public static ActivityData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new ActivityData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActivityPartData::parseFrom).toList()
        );
    }
    public static ActivityData parseFrom(java.util.List<ProtoField> fields) {
        return new ActivityData(
            Pojos.readInt(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.ActivityPartData::parseFrom).toList()
        );
    }
}
