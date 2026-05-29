// Generated from space_data.proto
package Next.pojo;

import com.roco.sniffer.codec.Pojos;
import com.roco.sniffer.codec.ProtoParser.ProtoField;
import com.roco.sniffer.codec.ProtoParser;
import java.util.List;

@SuppressWarnings("unused")
public record VisibleCircleData(
    long circleId,
    List<VisibleCircleMemberData> members,
    long visiblePlanId,
    int lastCheckTime,
    List<VisibleCirclePlaceHolderData> holders
) {
    public static VisibleCircleData parseFrom(byte[] data) {
        java.util.List<ProtoField> fields = ProtoParser.parse(data);
        return new VisibleCircleData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.VisibleCircleMemberData::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.VisibleCirclePlaceHolderData::parseFrom).toList()
        );
    }
    public static VisibleCircleData parseFrom(java.util.List<ProtoField> fields) {
        return new VisibleCircleData(
            Pojos.readLong(fields, 1),
            Pojos.readMessageList(fields, 2).stream().map(Next.pojo.VisibleCircleMemberData::parseFrom).toList(),
            Pojos.readLong(fields, 3),
            Pojos.readInt(fields, 4),
            Pojos.readMessageList(fields, 5).stream().map(Next.pojo.VisibleCirclePlaceHolderData::parseFrom).toList()
        );
    }
}
